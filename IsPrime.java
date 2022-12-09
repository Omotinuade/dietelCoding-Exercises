package ChapterSix;

public class IsPrime {

    public static void main(String[] args) {

            //testPrimeNumber(17);
            testPrime(10000);

        }

        private static void testPrimeNumber ( int number) {
            int factor = 0;
            int count = 1;
            int numberOfPrime = 0;
            for (; count <= number; count++) {

                if (number % count == 0)
                    factor++;
            }

            if (factor == 2) {
                numberOfPrime++;}
                System.out.println(number);

            }


            private static void testPrime(int number){
                ;
                for(int i=1; i<=number;i++){
                    testPrimeNumber(i);

                }
            }

        }






