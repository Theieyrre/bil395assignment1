public class Variable{
    String name, value;
    public Variable(){}
    public Variable(String name){ this.name = name; }
    public Variable(String name, String value){ this.name = name; this.value = value; }
    public String toString(){ return this.name+" "+this.value; }
    public String getName() { return this.name; }
    public String getValue() { return this.value; }
    public void setName (String name) { this.name = name;}
    public void setValue (String value) { this.value = value;}
}