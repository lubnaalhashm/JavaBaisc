
        public class NestedLoops {
            public static void main(String[] args) {
                int n = 4; // Number of rows

                for (int i = 1; i <= n; i++) {

                    if (i == (n + 1) / 2) {
                        continue;
                    }

                    for (int j = 1; j <= i; j++) {
                        System.out.print("*");
                    }

                    System.out.println();
                }
            }
        }


