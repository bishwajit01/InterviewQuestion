/**
 * 
 */
package concepts;

/**
 * @author Bishwajit.
 *
 */
public class CloningArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

        int[][] a = new int[3][4];
        int b[][] = a.clone();
        int c[] = {1,2,3};
        int d[] = c.clone();
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                a[i][j] = j;
            }
        }
        
        System.out.println(a == b); //false
        System.out.println(c == d); //false
        System.out.println(a.equals(b)); //false
        System.out.println(c.equals(d)); //false
        System.out.println(a[1] == b[1]); //true
        System.out.println(c[1] == d[1]); //true
        System.out.println(a[1][2] == b[1][2]); //true

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(b[i][j] + " ");
            }
            System.out.println();
        }

	}

}
