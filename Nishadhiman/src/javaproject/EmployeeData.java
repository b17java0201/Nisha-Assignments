package javaproject;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class EmployeeData {

			
		
		    int id;
		    String name;
		    float sallary;
		    
		    EmployeeData(int id,String name,float sallary){
		        this.id=id;
		        this.name=name;
		        this.sallary=sallary;
		        
		    }
		    
		    float calculateSallary(){
		        sallary=sallary-((sallary/100)*20);
		        
		        return(sallary);
		    }
		    
		    void display(){
		        System.out.println(id+" "+name);
		        System.out.println("sallary is "+sallary);
		    }

		   
		}

		class Demo{
		    public static void main(String[] args)throws IOException {
		        int id;
		        String name;
		        float sallary;
		        
		        EmployeeData emp[];
		        emp = new EmployeeData[4];
		        BufferedReader br;
		        br = new BufferedReader(new InputStreamReader(System.in));
		        
		        
		        for(int i=0;i<emp.length;i++){
		            System.out.println("Enter id of "+i);           
		            id=Integer.parseInt(br.readLine());
		            System.out.println("enter name of "+i);
		            name=br.readLine();
		            System.out.println("enter sallary of "+i);
		            sallary=Float.parseFloat(br.readLine());
		            emp[i]=new EmployeeData(id,name,sallary);         
		                    
		        }
		        for (int j = 0;j<emp.length;j++) {
		            emp[j].calculateSallary();
		            emp[j].display();
		        }    
		                
		        
		                
		    }
		}
	


