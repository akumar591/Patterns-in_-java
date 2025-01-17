public class Main{
    public static void main(String []args){
        int n = 5;
        //Square_Pattern
        System.out.println("   Square_Pattern;");
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= n; j++){
                System.out.print(" ");
            }
            for(int j = 1; j <= n; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        //Square_Number_Pattern_j++;
        System.out.println();
        System.out.println("Square_Number_j++_Pattern;");
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= n; j++){
                System.out.print(" ");
            }
            for(int j = 1; j <= n; j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
        //Square_Number_Pattern_j--;
        System.out.println();
        System.out.println("Square_Number_j--_Pattern;");
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= n; j++){
                System.out.print(" ");
            }
            for(int j = n; j >= 1; j--){
                System.out.print(j+" ");
            }
            System.out.println();
        }
        //Square_Number_1,0_Pattern;
        System.out.println();
        System.out.println("Square_Number_1,0_Pattern;");
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= n; j++){
                System.out.print(" ");
            }
            for(int j = 1; j <= n; j++){
                if((i+j)%2 == 0){
                    System.out.print("1 ");
                }
                else{
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
        //Square_Number_1,0_Pattern;
        System.out.println();
        System.out.println("Square_Number_1,0_Pattern;");
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= n; j++){
                System.out.print(" ");
            }
            for(int j = 1; j <= n; j++){
                if( i%2 == 0){
                    System.out.print("1 ");
                }else {
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
        //Square_Number_1,0_Pattern;
        System.out.println();
        System.out.println("Square_Number_1,0_Pattern;");
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= n; j++){
                System.out.print(" ");
            }
            for(int j = 1; j <= n; j++){
                if(j %2 != 0 ){
                    System.out.print("1 ");
                }
                else{
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
        //Square_Hollow_Pattern;
        System.out.println();
        System.out.println("Square_Hollow_Pattern;");
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= n; j++){
                System.out.print(" ");
            }
            for(int j = 1; j <= n; j++){
                if(i == 1 || j == 1 || j == n || i == n) {
                    System.out.print("* ");
                }else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        //Square_Hollow_Pattern;
        System.out.println();
        System.out.println("Square_Hollow_2_Pattern;");
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= n; j++){
                System.out.print(" ");
            }
            for(int j = 1; j <= n; j++){
                if(i == 1 || j == 1 || j == n || i == n || (i+j)%2 == 0) {
                    System.out.print("* ");
                }else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        //Rhombus_Pattern;
        System.out.println();
        System.out.println("   Rhombus_Pattern;");
        for(int i =1 ; i <= n; i++){
            for(int j = 1; j <= 2*n-i; j++){
                System.out.print(" ");
            }
            for(int j = 1; j <= n; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        //Opposite_Rhombus_Pattern;
        System.out.println();
        System.out.println("Opposite_Rhombus_Pattern;");
        for(int i =n ; i >= 1; i--){
            for(int j = 1; j <= 2*n-i; j++){
                System.out.print(" ");
            }
            for(int j = 1; j <= n; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        //Rhombus_Pattern;
        System.out.println();
        System.out.println("   Rhombus_Pattern;");
        for(int i =1 ; i <= n; i++){
            for(int j = 1; j <= 2*n-i; j++){
                System.out.print(" ");
            }
            for(int j = 1; j <= n; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        //Pyramid_Pattern;
        System.out.println();
        System.out.println("   Pyramid_Pattern;");
        for(int i = 1; i <= n; i++){
            for(int j = 1; j<= 2*n-i; j++){
                System.out.print(" ");
            }
            for(int j = 1; j <= i ; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        //Pyramid_Pattern_i++;
        System.out.println();
        System.out.println("Pyramid_Pattern_i++;");
        for(int i = 1; i <=n; i++){
            for(int j = 1; j<=2*n-i; j++){
                System.out.print(" ");
            }
            for(int j = 1; j <= i; j++ ){
                System.out.print(i+" ");
            }
            System.out.println();
        }
        //Pyramid_Pattern_j++;
        System.out.println();
        System.out.println("Pyramid_Pattern_j++;");
        for(int i = 1; i <=n; i++){
            for(int j = 1; j<=2*n-i; j++){
                System.out.print(" ");
            }
            for(int j = 1; j <= i; j++ ){
                System.out.print(j+" ");
            }
            System.out.println();
        }
        //Pyramid_Pattern_1,0;
        System.out.println();
        System.out.println("Pyramid_Pattern_1,0;");
        for(int i = 1; i <= n; i++){
            for(int j = 1; j<=2*n-i ; j++){
                System.out.print(" ");
            }
            for(int j = 1; j <= i; j++){
                if((i+j)%2 == 0){
                    System.out.print("0 ");
                }else {
                    System.out.print("1 ");
                }
            }
            System.out.println();
        }
        //Palindrome_Pyramid_Pattern;
        System.out.println();
        System.out.println("Palindrome_Pyramid;");
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= 2*n-i; j++){
                System.out.print(" ");
            }
            for(int j = i; j >= 1; j--){
                System.out.print(j);
            }
            for(int j = 2; j <= i; j++){
                System.out.print(j);
            }
            System.out.println();
        }
        //Half_Pyramid_Pattern;
        System.out.println();
        System.out.println("Half_Pyramid_Pattern;");
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= 2*n-i; j++){
                System.out.print(" ");
            }
            for(int j = 1; j <= i; j++ ){
                System.out.print("*");
            }
            System.out.println();
        }
        //Half_Opposite_Pyramid;
        System.out.println();
        System.out.println("Half_Opposite_Pyramid;");
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= 2*n-i; j++){
                System.out.print(" ");
            }
            for(int j = 1; j <= i; j++){
                System.out.print(" ");
            }
            for(int j = 1; j<= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        //Half_Opposite_Pyramid_i;
        System.out.println();
        System.out.println("Half_Pyramid_i++;");
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= 2*n-i; j++){
                System.out.print(" ");
            }
            for(int j = 1; j <= i; j++){
                System.out.print(i);
            }
            System.out.println();
        }
        //Half_Opposite_Pyramid;
        System.out.println();
        System.out.println("Half_Opposite_Pyramid_j++;");
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= 2*n-i ; j++){
                System.out.print(" ");
            }
            for(int j = 1; j <= i; j++){
                System.out.print(" ");
            }
            for(int j = 1; j <= i; j++){
                System.out.print(j);
            }
            System.out.println();
        }
        //Half_Opposite_Pyramid;
        System.out.println();
        System.out.println("Half_Pyramid_j--;");
        for(int i = 1; i <= n; i ++){


            for(int j = 1; j <= 2*n-i; j++){
                System.out.print(" ");
            }
            for(int j = i; j>= 1; j--){
                System.out.print(j);
            }
            System.out.println();
        }
        //Half_Opposite_Pyramid;
        System.out.println();
        System.out.println("Half_Opposite_1,0_Pyramid");
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= 2*n-i; j++){
                System.out.print(" ");
            }
            for(int j = 1; j <= i; j++){
                System.out.print(" ");
            }
            for(int j = 1; j <= i; j++){
                if((i+j)%2 == 0){
                    System.out.print("1");
                }else {
                    System.out.print("0");
                }
            }
            System.out.println();
        }
        //Half_Opposite_Pyramid;
        System.out.println();
        System.out.println("Half_1,0_Pyramid");
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= 2*n-i ; j++){
                System.out.print(" ");
            }
            for(int j = 1; j <= i ; j++){
                if((i+j)% 2 == 0){
                    System.out.print("1");
                }else{
                    System.out.print("0");
                }
            }
            System.out.println();
        }
        //Half_Opposite_Pyramid;
        System.out.println();
        System.out.println("Half_Opposite_i_Pyramid");
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= 2*n-i; j++){
                System.out.print(" ");
            }
            for(int j = 1; j <= i ; j++){
                System.out.print(" ");
            }
            for(int j = 1; j <= i; j++){
                System.out.print(i);
            }
            System.out.println();
        }
        //Diamond_Pattern;
        System.out.println();
        System.out.println("  Diamond_Pattern;");
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= 2*n-i; j++){
                System.out.print(" ");
            }
            for(int j = 1; j <= i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int i = 4; i >= 1; i--){
            for(int j = 1; j <= 2*n-i; j++){
                System.out.print(" ");
            }
            for(int j = 1; j <= i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();
        //Diamond_Pattern;
        System.out.println("Diamond_1,0_Pattern;");
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= 2*n-i; j++){
                System.out.print(" ");
            }
            for(int j = 1; j <= i; j++){
                if((i+j)%2 == 0){
                    System.out.print("1 ");
                }else{
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
        for(int i = 4; i >= 1; i--){
            for(int j = 1; j <= 2*n-i; j++){
                System.out.print(" ");
            }
            for(int j = 1; j <= i; j++){
                if((i+j) % 2 == 0){
                    System.out.print("1 ");
                }
                else{
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
        System.out.println();
        //Diamond_Pattern;
        System.out.println("Diamond_Pattern_int-j++;");
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= 2*n-i; j++){
                System.out.print(" ");
            }
            for(int j = 1; j <= i ; j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
        for(int i = 4 ; i >= 1; i--){
            for(int j = 1; j <= 2*n-i; j++){
                System.out.print(" ");
            }
            for(int j = 1; j <= i; j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
        System.out.println();
        //Diamond_Pattern;
        System.out.println("Diamond_Palindrome_Pattern;");
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= 2*n-i; j++){
                System.out.print(" ");
            }
            for(int j = i; j >= 1; j--){
                System.out.print(j);
            }
            for(int j = 2; j <= i; j++){
                System.out.print(j);
            }
            System.out.println();
        }
        for(int i = 4; i >= 1; i--){
            for(int j = 1; j <= 2*n-i ; j++){
                System.out.print(" ");
            }
            for(int j = i; j >= 1; j--){
                System.out.print(j);
            }
            for(int j = 2; j <= i; j++){
                System.out.print(j);
            }
            System.out.println();
        }
        System.out.println();
        //Diamond_Pattern;
        System.out.println("Diamond_Pattern_int-i++;");
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= 2*n-i; j++){
                System.out.print(" ");
            }
            for(int j = 1; j <= i; j++){
                System.out.print(i);
            }
            for(int j = 2; j <= i; j++){
                System.out.print(i);
            }
            System.out.println();
        }
        for(int i = 4; i >= 1; i--){
            for(int j = 1; j <= 2*n-i; j++){
                System.out.print(" ");
            }
            for(int j = 1; j <= i ; j++){
                System.out.print(i);
            }
            for(int j = 2; j <= i ; j++){
                System.out.print(i);
            }
            System.out.println();
        }
        System.out.println();
        //Butterfly_Pattern;
        System.out.println(" Butterfly_Pattern;");
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= i; j++){
                System.out.print("* ");
            }
            for(int j = 1; j <= n-i; j++ ){
                System.out.print("  ");
            }
            for(int j = 1; j <= n-i; j++ ){
                System.out.print("  ");
            }
            for(int j = 1 ; j <= i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int i = n; i >= 1; i--){
            for(int j = 1; j <= i; j++){
                System.out.print("* ");
            }
            for(int j = 1; j <= n-i; j++){
                System.out.print("  ");
            }
            for(int j = 1; j <= n-i; j++){
                System.out.print("  ");
            }
            for(int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        //Rhombus_Pattern;
        System.out.println();
        System.out.println("  Rhombus_Pattern;");
        for(int i = n; i >= 1; i--){
            for(int j = 1; j <= i; j++){
                System.out.print(" ");
            }
            for(int j = 1; j <= n; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        //Butterfly_Pattern;
        System.out.println();
        System.out.println("Butterfly_int-j++;");
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= i; j++){
                System.out.print(j+" ");
            }
            for(int j = 1; j <= n-i; j++){
                System.out.print("  ");
            }
            for(int j = 1; j <= n-i; j++){
                System.out.print("  ");
            }
            for(int j = 1; j <= i; j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
        for(int i = n; i >= 1; i--){
            for(int j = 1; j <= i; j++){
                System.out.print(j+" ");
            }
            for(int j = 1; j <= n-i ; j++){
                System.out.print("  ");
            }
            for(int j = 1; j <= n-i; j++){
                System.out.print("  ");
            }
            for(int j = 1; j <= i; j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
        //Butterfly_Pattern;
        System.out.println();
        System.out.println("Butterfly_1,0_Pattern;");
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= i; j++){
                if((i+j)% 2 == 0){
                    System.out.print("1 ");
                }else{
                    System.out.print("0 ");
                }
            }
            for(int j = 1; j <= n-i ; j++){
                System.out.print("  ");
            }
            for(int j = 1; j <= n-i ; j++){
                System.out.print("  ");
            }
            for(int j = 1; j <= i; j++){
                if((i+j)% 2 == 0){
                    System.out.print("1 ");
                }else{
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
        for(int i = n; i >=1; i--){
            for(int j = 1; j <= i ; j++){
                if((i+j) % 2 == 0){
                    System.out.print("1 ");
                }else{
                    System.out.print("0 ");
                }
            }
            for(int j = 1; j <= n-i ; j++){
                System.out.print("  ");
            }
            for(int j = 1; j <= n-i ; j++){
                System.out.print("  ");
            }
            for(int j = 1; j <= i ; j++){
                if((i+j) % 2 == 0){
                    System.out.print("1 ");
                }else{
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }

    }
}