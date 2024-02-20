/**
 * The "calcy" class performs basic arithmetic operations such as addition, subtraction,
 * multiplication, and division on two floating-point numbers.
 */
class calcy{
    float addition(float operand_1,float operand_2){
        return(operand_1+operand_2);
    }

    float substraction(float operand_1,float operand_2){
        return(operand_1-operand_2);
    }

    /**
     * The function "multiplication" takes two float operands and returns their product.
     * 
     * @param operand_1 The first operand for multiplication. It is a floating-point number.
     * @param operand_2 The second operand in the multiplication operation.
     * @return The product of operand_1 and operand_2 is being returned.
     */
    float multiplication(float operand_1,float operand_2){
        return(operand_1*operand_2);
    }
    float division(float operand_1,float operand_2){
        return(operand_1/operand_2);
    }
    int square(int number){
        return number*number;
    }
    int cube(int number){
        return number*number*number;
    }

    
    

    public static void main(String[] args){
        float operand_1=10;
        float operand_2=5;
        
        calcy c=new calcy();
        float add_result=c.addition(operand_1,operand_2);
        System.out.println("Result of Addition is:"+add_result);

        float sub_result=c.substraction(operand_1,operand_2);
        System.out.println("Result of Substraction is:"+sub_result);

        float mul_result=c.multiplication(operand_1,operand_2);
        System.out.println("Result of Multiplication is:"+mul_result);

        float div_result=c.division(operand_1,operand_2);
        System.out.println("Result of Division is:"+div_result);
        int number=5;
        int sqr_result=c.square(number);
        System.out.println("Square of number:"+sqr_result);
        int cube_result=c.cube(number);
        System.out.println("cube of a number is:"+cube_result);
        



    }


}