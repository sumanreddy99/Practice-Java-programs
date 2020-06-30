class Test
{
//    public static void main(String[] args)
//    {
//        try
//        {
//            int a[]= {1, 2, 3, 4};
//            for (int i = 1; i <= 4; i++)
//            {
//                System.out.println ("a[" + i + "]=" + a[i] + "n");
//            }
//        }
//         
//        catch (Exception e)
//        {
//            System.out.println ("error = " + e);
//        }
//         
//        catch (ArrayIndexOutOfBoundsException e)
//        {
//            System.out.println ("ArrayIndexOutOfBoundsException");
//        }
//    }
//====================================================================================

//String str = "a";
// 
//    void A()
//    {
//        try
//        {
//            str +="b";
//            B();
//        }
//        catch (Exception e)
//        {
//            str += "c";
//        }
//    }
// 
//    void B() throws Exception
//    {
//        try
//        {
//            str += "d";
//            C();
//        }
//        catch(Exception e)
//        {
//            throw new Exception();
//        }
//        finally
//        {
//            str += "e";
//        }
// 
//        str += "f";
// 
//    }
//     
//    void C() throws Exception
//    {
//        throw new Exception();
//    }
// 
//    void display()
//    {
//        System.out.println(str);
//    }
// 
//    public static void main(String[] args)
//    {
//        Test object = new Test();
//        object.A();
//        object.display();
//    }
// 
//=========================================================================
//int count = 0;
// 
//    void A() throws Exception
//    {
//        try
//        {
//            count++;
//			System.out.println("try1"+count);
//             
//            try
//            {
//                count++;
// System.out.println("try2"+count);
//                try
//                {
//                    count++;
//					System.out.println("try3"+count);
//                    throw new Exception();
// 
//                }
//                 
//                catch(Exception ex)
//                {
//                    count++;
//					System.out.println("try4"+count);
//            
//                    throw new Exception();
//                }
//            }
//             
//            catch(Exception ex)
//            {
//				count++;
//				System.out.println("catch1"+count);
//                
//            }
//        }
//         
//        catch(Exception ex)
//        {
//			count++;
//			
//        }
// 
//    }
// 
//    void display()
//    {
//        System.out.println(count);
//    }
// 
//    public static void main(String[] args) throws Exception
//    {
//        Test obj = new Test();
//        obj.A();
//        obj.display();
//    }


public static void main(String[] args) 
    { 
        try
        { 
            System.out.printf("1"); 
           // int value = 10 / 0; 
            throw new java.io.IOException(); 
        } 
        catch(java.io.EOFException e) 
        { 
            System.out.printf("2"); 
        } 
        catch(ArithmeticException e) 
        { 
            System.out.printf("3"); 
        } 
        catch(NullPointerException e) 
        { 
            System.out.printf("4"); 
        } 
        catch(java.io.IOException e) 
        { 
            System.out.printf("5"); 
        } 
        catch(Exception e) 
        { 
            System.out.printf("6"); 
        } 
    } 
}
