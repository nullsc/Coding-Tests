public class Employee extends Person {
    private int salary;
    // constructors, methods ...
    
    @Override
    public boolean equals(Object obj){
        if (obj == null)
            return false;
            
        if (!(obj instanceof Employee))
            return false;
            
        Employee p = (Employee)obj;
        //if (this.getname() != p.getname())
        //    return false;
        
        if(! super.equals(obj)) // compare name from super constructor
            return false;
            
        if (this.salary != p.salary)
            return false;
            
        return true;
    }
}
