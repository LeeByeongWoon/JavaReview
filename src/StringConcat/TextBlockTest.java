package StringConcat;

public class TextBlockTest {
    public static void main(String[] args) {
        // html 구조나 json 구조를 받거나 보내는데 유용함
        String textBlocks = """
                <!DOCTYPE html>
                <html lang="en">
                <head>
                    <meta charset="UTF-8">
                    <meta http-equiv="X-UA-Compatible" content="IE=edge">
                    <meta name="viewport" content="width=device-width, initial-scale=1.0">
                    <title>Document</title>
                </head>
                <body>
                    <p>hello!</p>
                </body>
                </html>
              """;
        System.out.println(textBlocks);
    }
}
