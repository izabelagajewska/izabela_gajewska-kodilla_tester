public class RandomNumbers {
    int min=0; int max=30;
    public static int getRandomint(int min, int max) {
        int x=0;
      //  Random x= new random();
     //  x=random.nextInt(max-min+1)+min;        // z jakiegos powodu nie widzi 'random'
        return x;
    }

    public static void main(String[] args) {

        int sum = 0;
        int zmien = 0;
        int maxim= 0;
        int minim = 30;
       while (sum < 5000) {
         zmien = getRandomint(0,30);
            sum += zmien;
            if (maxim < zmien) maxim = zmien;
           if (minim > zmien) minim = zmien;
           sum = sum + zmien;
        }
        System.out.println("Największa liczba to" + maxim + ",");
        System.out.println("Najmniejsza liczba to" + minim + ",");
    }

    }


