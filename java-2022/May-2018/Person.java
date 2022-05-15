public class Person {
    private String name;
// constructors, methods ...

    public String getname(){
        return name;
    }
    
    @Override
    public boolean equals(Object obj){
        if (this.name == null || obj == null)
            return false;
            
        if (!(obj instanceof Person))
            return false;
            
        Person p = (Person)obj;
            
        return this.name.equals(p.name); // String compare
    }
}
