package task1;

public class Main {
    public static void main(String[] args) {

        //String s = "J@va the be$t!123"; // →"t@eb eht av$J!123";
        String s = "C0de_@ Rev!ew99"; // fteb eht av$a!1J3
        //String s = "Int3l#J Cor@2026x";
        if (s.isEmpty() || s.length() <=1) {
            System.out.println("Строка слишком короткая или пустая");
        }
        else {
                int n = s.length();        // 4
                char c = s.charAt(0);      // 'J'
                char[] chars = s.toCharArray();   // ['J','a','v','a'] — массив символов

                int left = 0;
                int right = chars.length - 1;

                while (left < right) {
                    if(!Character.isLetter(chars[left])){
                        left++;
                    }
                    else if(!Character.isLetter(chars[right])){
                        right--;
                    }
                    else {
                        char tmp = chars[left];     // меняем местами края
                        chars[left] = chars[right];
                        chars[right] = tmp;
                        left++;                     // сдвигаем указатели навстречу
                        right--;
                    }
                }
                System.out.println(new String(chars));  // "avaJ"
        }
    }
}
