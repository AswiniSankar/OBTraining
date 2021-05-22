package com.corejava.assignments;

import java.util.Scanner;

public class SwitchCases {

	public static void main(String[] args) {
	 @SuppressWarnings({ "resource" })
	Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("1.Selection Statement 2.Iteration Statement 3.Jump Statement 4.exit");
		    int input= sc.nextInt();
		    switch(input) {
		    case 1:
		    	System.out.println("1.if 2.if-else 3. if else ladder 4. nested if 5.switch");
		    	int choice= sc.nextInt();
		    	switch(choice) {
		    	case 1:
		    		System.out.println("\n" + 
		    				"    if(condition)  \n" + 
		    				"    {  \n" + 
		    				"        statements;  \n" + 
		    				"        ...  \n" + 
		    				"        ...  \n" + 
		    				"    }  \n" + 
		    				"");break;
		    	case 2:
		    		System.out.println("if (condition)  \n" + 
		    				"{  \n" + 
		    				"    first statement;  \n" + 
		    				"}  \n" + 
		    				"else  \n" + 
		    				"{  \n" + 
		    				"    second statement;  \n" + 
		    				"} ");break;
		    	case 3:
		    		System.out.println("if (condition)  \n" + 
		    				"{  \n" + 
		    				"    first statement;  \n" + 
		    				"}  \n" + 
		    				"else if(condition) \n"+
		    				"{ \n"+
		    				"    second statement;  \n" + 
		    				"} \n"+
		    				"        ...  \n" + 
		    				"        ...  \n" + 
		    				"else  \n" + 
		    				"{  \n" + 
		    				"    final statement;  \n" + 
		    				"} ");break;
		    	case 4:
		    		System.out.println("\n" + 
		    				"    if(condition)  \n" + 
		    				"    {  \n" + 
		    				"        statements;  \n" +
							"\n" + "        if(condition)  \n" + 
		    				"               {  \n" + 
							"                    statements;  \n" +
		    				"                     ...  \n"
							+      "              ...  \n" + 
                            "                }  \n" + 
                            "     else  \n" + 
		    				"     {  \n" + 
		    				"          statements;  \n" + 
		    			    "     } "+ 
		    				"");break;
		    	case 5:
		    		System.out.println("\n" + 
		    				"    switch (expression)  \n" + 
		    				"    {  \n" + 
		    				"        case 1:  \n" + 
		    				"        {  \n" + 
		    				"            statement;  \n" + 
		    				"        }  \n" + 
		    				"        break;  \n" + 
		    				"        case 2:  \n" + 
		    				"        {  \n" + 
		    				"            statement;  \n" + 
		    				"        }  \n" + 
		    				"        break;  \n" + 
		    				"        .  \n" + 
		    				"        .  \n" + 
		    				"        .  \n" + 
		    				"        case N:  \n" + 
		    				"        {  \n" + 
		    				"            statement;  \n" + 
		    				"        }  \n" + 
		    				"        break;  \n" + 
		    				"        default:  \n" + 
		    				"        {  \n" + 
		    				"            statement;  \n" + 
		    				"        }  \n" + 
		    				"        break;  \n" + 
		    				"    }  \n" + 
		    				"");break;
		    	default:System.out.println("incorrect choice");
		    	}
		    	break;
		    case 2:
		    	System.out.println("1.for 2. while 3. do while");
		    	int choice1= sc.nextInt();
		    	switch(choice1) {
		    	case 1:
		    		System.out.println("for (initial value; condition; incrementation or decrementation ) \n" + 
		    				"{\n" + 
		    				"  statements;\n" + 
		    				"}");break;
		    	case 2:
		    		System.out.println("while (condition) {\n" + 
		    				"             statements;\n" + 
		    				"}");break;
		    	case 3:
		    		System.out.println("do {\n" + 
		    				"  statements\n" + 
		    				"} while (expression);");break;
		    
		    	default:System.out.println("incorrect choice");
		    	}
		    	break;
		    case 3:
		    	System.out.println("1.break 2. continue 3. return");
		    	int choice2= sc.nextInt();
		    	switch(choice2) {
		    	case 1:
		    		System.out.println("   break");break;
		    	case 2:
		    		System.out.println("   continue");break;
		    	case 3:
		    		System.out.println("    return");break;
		    
		    	default:System.out.println("incorrect choice");
		    	}
		    	break;
		    case 4: System.exit(0);
		    default:System.out.println("incorrect choice");
		    }
		
		}
		

	}

}
