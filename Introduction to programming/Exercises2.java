public class Exercises2 {



    // 이름을 출력하는 프로그램 만든 후 이름의 처음과 마지막 문자 출력
    public static String Exercise2_1(String name) {
        char[] result = new char[2];
        result[0] = name.charAt(0);
        result[1] = name.charAt(name.length() - 1);

        return new String(result);
    }

    // Exercise2,2 그림(diagram)을 통해 Exercise2_1이 실행되었을 때 메모리에 무슨일이 일어나는지 설명


    // 입력된 문자열 읽은 뒤 첫번째와 마지막 문자를 바꿔 출력 이때 메모리에 무슨 일이 일어나는지 설명
    public static void Exercise2_4(String str) {
    char first = str.charAt(0);
        char lsat = str.charAt(str.length() - 1);

        char[] cArr = str.toCharArray();
        cArr[0] = lsat;
        cArr[cArr.length - 1] = first;

    }


    // Exercis2_4 문제를 Stringbuffer를 사용해서 해결 메모리 동작 설명

    public static void Exercise2_5(String str){
        StringBuffer sb = new StringBuffer(str);
        
        char first = str.charAt(0);
        char last = str.charAt(str.length()-1);
        
        sb.replace(0, 1, last+"");
        sb.replace(sb.length()-1, sb.length(), first+"");
         
        System.out.println(sb.toString());
        
        
        
    }



    
}