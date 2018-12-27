/**
 * File Name: Length.java 
 *
 * 
 * @author Jagadeesh Vasudevamurthy
 * @year 2015
 */


class Length {
  private static final IntUtil u = new IntUtil();
  //YOU CANNOT ADD ANY VARIABLE HERE
  
  private static int length_easy(int [] s, int x) {
    //CANNOT CHANGE BELOW
    int l = 0 ;
    int gx = x ;
    while (true) {
      if (s[x] == gx) {
        return l ;
      }
      x = s[x] ;
      ++l ;
    }  
  }
  
  
  private static int length(int [] s, int x) { 
	  int[] b = new int[8];
	  int value1 = b[x];
	  if (value1 == x)
		  return 0;
	  int value2 = b[value1];
	  int temp = b[x];
	  b[x] = value2;
	  b[value1] = temp;
	  return 1 + length(b,x);
    //WRITE CODE HERE
    //AFTER THE execution of this routine array s MUST have the same contents as you got it.
    //YOU cannot call any subroutine inside this function

  }
  
  //NOTHING CAN BE CHANGED BELOW
  public static void testbed() {
    //CANNOT CHANGE BELOW
    int s[] = {5,1,0,4,2,3} ;
    int y = length_easy(s,3) ;
    System.out.println("length_easy y = " + y);
    u.myassert(y == 4) ;
    int b[] = {5,1,0,4,2,3} ;
    int x = length(s,3) ;
    System.out.println("length x = " + x);
    u.myassert(x == y) ;
    for (int i = 0; i < s.length; ++i) {
      u.myassert(s[i] == b[i]);
    }
    System.out.println("Assert passed");
  }
  
  public static void testbed1() {
    //CANNOT CHANGE BELOW
    int s[] = {5,1,0,4,2,3} ;
    int b[] = {5,1,0,4,2,3} ;
    int l = s.length ;
    for (int j = 0; j < l ; ++j) {
      System.out.println("---------------------j = " + j + " ------------------");
      int y = length_easy(s,j) ;
      System.out.println("length_easy y = " + y);
      int x = length(s,j) ;
      System.out.println("length x = " + x);
      u.myassert(x == y) ;
      for (int i = 0; i < s.length; ++i) {
        u.myassert(s[i] == b[i]);
      }
      System.out.println("---------------------Assert passed--------------------");
    }
  }
  
  public static void main(String[] args) {
    System.out.println("Length.java");
    testbed() ;
    testbed1() ;
  }
}
