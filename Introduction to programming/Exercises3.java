import java.util.regex.Matcher;
import java.util.regex.Pattern;



// Exercise 3.1
class Book {
    private String title;
    private String author;
    private int price;

    public Book(String title, String author, int price) {
        // ???
        this.title = checkStr(title);
        this.author = checkStr(author);
        setPrice(checkInt(price));
    }

    public void printBook() {
    // System.out.printf("title : %s%n author : %s%n", getTitle(), getAuthor());
        System.out.println(this.toString());
    }

    // public void printBookPrice() {
    //     printBook();
    //     System.out.printf("price : %d%n", getPrice());
    // }

    // public -> private
    private String getTitle() {
        return this.title;
    }

    // public -> private
    private String getAuthor() {
        return this.author;
    }

    // public -> private
    private int getPrice() {
        return this.price;
    }

    // public -> private
    private void setPrice(int price) {
        this.price = price;
    }

    
    @Override
    public String toString(){
        return "Title : "+ getTitle() + "\n" +
               "Author : "+ getAuthor() + "\n"+
               "Price : "+ getPrice() + "\n";
    }

    //  유효성 검사--------------------------------------------------
    public static String checkStr(String str){
        Pattern pattern = Pattern.compile("^[a-z|A-Z]*$");
        Matcher matcher = pattern.matcher(str);
        
        if(!(matcher.matches())){
            throw new IllegalArgumentException("잘못된 입력 방식입니다 다시 입력하세요.");
         }

         return str;
        
    }
    public static int checkInt(int value){
        Pattern pattern = Pattern.compile("^[0-9]*$");
        Matcher matcher = pattern.matcher(value+"");

        if(!(matcher.matches())){
            throw new IllegalArgumentException("잘못된 입력 방식입니다 다시 입력하세요");
        }

        return value;

        
    }
}

public class Exercises3 {
      public static void main(String[] args) {
        // --------------------------------------------Exercise3.1-----------------------------------
        // Book firstBook = new Book("Harry Potter", "j.k Rowling");
        // Book secondBook = new Book("secondBook", "kimtaesu");

        // firstBook.getPrice();
        // firstBook.printBookPrice();
        // firstBook.setPrice(100);


       //  내부에서 유효성 검사 
       Book firstBook = new Book("HarryPotter","Rowling",100);
       Book secondBook = new Book("secondBook","Kimtaesu",100);
       
       firstBook.printBook();
        secondBook.printBook();

        



        // ------------------------------------------Exercise3.5------------------------------------
        // String numberOfSender = "010_1234_5678";
        // static method로 유효성 검사 (외부)
        MessageText messageText = MessageText.getInstance(MessageText.check("ily"),MessageText.check("darling"));

        Message message = new Message(messageText, Message.check("010_4809_2323"),Message.check("010_2313_2314")); 
        message.printMessage();

    }

}

// Exercise 3.3 ------------------------------------------------------------------------------------------------
class MessageText {

    private String code;
    private String completeMessage;

    private MessageText(String code, String completeMessage) {
        this.code = code;
        this.completeMessage = completeMessage;
    }

    // constructor? method?
    public static MessageText getInstance(String code, String completeMessage) {
        return new MessageText(code, completeMessage);
    }

    // public -> private
    private String getCode() {
        return this.code;
    }

    // public -> private
    private String getMessage() {
        return this.completeMessage;
    }

    @Override
    public String toString() {
        return "Code : " + getCode() + "\n" +
                "Message : " + getMessage() + "\n";

    }

    // MessageText 유효성 검사
    public static String check(String codeOrMessage) {
        Pattern pattern = Pattern.compile("^[a-z|A-Z]*$");
        Matcher matcher = pattern.matcher(codeOrMessage);

        if (!(matcher.matches())) {
            throw new IllegalArgumentException("잘못된 메세지 형식입니다 다시 입력하세요.");
        }

        return codeOrMessage;

    }

}//-------------------------------------------------------------------------------------------------------------------------

// Exercise 3.4
class Message {
    //
    private String numberToCall;
    private String numberOfSender;
    private MessageText messageText;

    // 사용 가능한 constructor
    // -------------------------------constructor------------------------------------
    public Message(MessageText messageText, String numberToCall, String numberOfSender) {
        this(messageText, numberOfSender);
        setNumberToCall(numberToCall);
    }

    private Message(MessageText messageText, String numberOfSender) {
        this(messageText);
        this.numberOfSender = numberOfSender;
    }

    private Message(MessageText messageText) {
        this.messageText = messageText;
    }

    // setNumber 선언
    private void setNumberToCall(String numberToCall) {
        this.numberToCall = numberToCall;
    }
    // ----------------------------------------------------------------------------------------------

    // Ex 3.4 -----------------------------------------------------------------------
    public void printMessage() {
        // ??
        // System.out.printf("Code : %s%n completeMessage %s%n", messageText.getCode(),messageText.getMessage(), this.getNumberToCall(), this.getNumberOfSender());
        // System.out.println(message.toString() + this.toString());
        System.out.println(this.toString());
    }

    // Ex 3.5 유효성 검사?
    public static String check(String number) {
        Pattern pattern = Pattern.compile("^\\d{3}_\\d{3,4}_\\d{4}$");
        Matcher matcher = pattern.matcher(number);

        if (!(matcher.matches())) {
            // Exception ??
            throw new IllegalArgumentException("잘못된 형식의 번호입니다 다시 입력하세요");
        }

        return number;

    }//---------------------------------------------------------------------------

    // Ex 3.5 message Infomation

    // public -> private
    private String getNumberToCall() {
        return this.numberToCall;
    }

    // public -> private
    private String getNumberOfSender() {
        return this.numberOfSender;
    }

    @Override
    public String toString() {
        return this.messageText.toString() + "NumberToCall : " + getNumberToCall() + "\n" + "NumberOfSender : "
                + getNumberOfSender() + "\n";

    }//-----------------------------------------------------------------

}

