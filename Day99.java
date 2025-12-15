public class Day99 {
    public static void main(String[] args) {

        
        int N =9;
          System.out.println("Bilangan prima dari 1 sampai " + N + ":");

          for (int i = 2; i <= N; i++) {
              boolean prima = true;

              for (int j = 2; j <= i / 2; j++) {
                  if (i % j == 0) {
                      prima = false;
                        break;
                  }
              }

                if (prima) {
                    System.out.println(i);
                }
          }
    }
}
