public class HelloWorld {



    public static void main(String[] args) {
        System.out.println("Hello World") ;

                int [] arr_marks = new int[6];
        arr_marks[0]=97 ;
        arr_marks[1]=25;
        arr_marks[2]=35;
        arr_marks[3]=56 ;
        arr_marks[4]=60 ;
        arr_marks[5]=84 ;

            int i ;
              for (i=0;i<6;i++)
                  System.out.println("rollno:" + i + "scored" + evalauteClass(arr_marks[i]));

    }
     public static
    String evalauteClass(int k)
    {

        if (k <35 )
        {
            return "FAIL" ;
        }
        else if (k >= 35 && k <60 )
        {
            return "Second class" ;
        }
        else if (k>=60 && k<85 )
         {
        return "First class" ;
        }
        else
        {
            return  "****Distinction****" ;
        }
    }
}
