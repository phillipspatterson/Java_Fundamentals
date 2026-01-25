package labs_examples.objects_classes_methods.labs.methods;

public class MethodTraining {
    public static void main(String[] args) {
    int result = largestNumber(3,50,8,10);
        System.out.println(result);

    int textResult = countConsonants("banana");
        System.out.println(textResult);
    }

    public static int largestNumber(int a, int b, int c, int d){
        int largest = a;

        if (b > largest){
            largest = b;
        }
        if (c > largest){
            largest = c;
        }
        if (d > largest){
            largest = d;
        }
        return  largest;
    }

    public static int countConsonants(String word){
        int count = 0;
        for(int i = 0; i < word.length(); i++){
            char currentChar = word.charAt(i);
            if (Character.isLetter(currentChar)){
                if (currentChar != 'a' && currentChar != 'e' && currentChar != 'i'
                        && currentChar != 'o' && currentChar != 'u') {
                    count++;
                }
            }
        }
        return count;
    }
}

