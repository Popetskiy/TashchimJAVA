Исключения в Java нужны для того, чтобы программа могла корректно реагировать на ошибки, не падала полностью и давала возможность продолжить работу или корректно завершиться. Для тестировщика это особенно важно, чтобы автотесты могли безопасно обрабатывать неожиданные ситуации и логировать их.

Когда в программе возникает исключение, есть два основных варианта действий:

1. **Перехватить и обработать исключение** — программа «ловит» ошибку и выполняет действия, которые позволяют безопасно продолжить выполнение или корректно завершить работу.
    
2. **Пробросить исключение дальше** — передать его выше по стеку вызовов, чтобы обработка произошла в другом месте.
    

#### try-catch-finally

- **try** — блок кода, в котором может произойти ошибка.
    
- **catch** — блок, который перехватывает конкретное исключение и позволяет с ним работать.
    
- **finally** — блок, который выполняется всегда, независимо от того, произошло ли исключение. Обычно используется для освобождения ресурсов.
    

Пример:

```
WebDriver driver = null;try {    driver = new ChromeDriver();    driver.get("https://example.com");} catch (WebDriverException e) {    System.out.println("Не удалось запустить браузер: " + e.getMessage());} finally {    if (driver != null) {        driver.quit();    }    System.out.println("Блок finally выполняется всегда");}
```

Можно использовать несколько блоков `catch` для разных типов исключений:

```
try {    int[] numbers = {1, 2, 3};    System.out.println(numbers[5]);} catch (ArrayIndexOutOfBoundsException e) {    System.out.println("Ошибка индекса массива");} catch (Exception e) { // Важно: более общее исключение должно быть ниже!    System.out.println("Общее исключение");}
```

#### throw

- Оператор `throw` создаёт и «выбрасывает» исключение вручную.
    
- Используется, когда метод сталкивается с ситуацией, которую он не может обработать сам.
    

Пример:

```
public void checkAge(int age) {    if (age < 0) {        throw new IllegalArgumentException("Возраст не может быть отрицательным");    }    System.out.println("Возраст корректный");}
```

#### throws

- С помощью `throws` метод сообщает, какие исключения он может выбросить.
    
- Вызывающий метод должен либо обработать эти исключения, либо тоже указать их через `throws`.
    

Пример:

```
public void readFile() throws IOException {    FileReader reader = new FileReader("data.txt");}
```

#### try-with-resources

- Это специальная форма `try`, которая автоматически закрывает ресурсы (например, файлы, потоки, соединения с базой данных) после завершения блока.
    
- Ресурс должен реализовывать интерфейс `AutoCloseable`.
    
- Позволяет не писать отдельный блок `finally` для освобождения ресурсов — метод `close()` вызывается автоматически.
    

Пример:

```
try (FileReader reader = new FileReader("data.txt");     BufferedReader bufferedReader = new BufferedReader(reader)) {    String line = bufferedReader.readLine();    System.out.println("Первая строка: " + line);} catch (IOException e) {    System.out.println("Ошибка при работе с файлом: " + e.getMessage());}// reader и bufferedReader автоматически закрыты здесь
```

Можно объявить несколько ресурсов через точку с запятой — все они будут закрыты автоматически в обратном порядке объявления.

Сравните с подходом без try-with-resources:

```
FileReader reader = null;BufferedReader bufferedReader = null;try {    reader = new FileReader("data.txt");    bufferedReader = new BufferedReader(reader);    String line = bufferedReader.readLine();    System.out.println("Первая строка: " + line);} catch (IOException e) {    System.out.println("Ошибка при работе с файлом: " + e.getMessage());} finally {    try {        if (bufferedReader != null) bufferedReader.close();        if (reader != null) reader.close();    } catch (IOException e) {        e.printStackTrace();    }}
```

Как видите, try-with-resources делает код намного чище и безопаснее.

[[Проброс исключения]]

Ресурс https://habr.com/ru/articles/964434/