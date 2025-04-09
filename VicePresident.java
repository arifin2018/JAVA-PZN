class VicePresident extends Manager {

    VicePresident(){
        super(null);
    }

    void sayHello(String name){
        System.out.println("Hi VP " + name + ", My Name Is VP " + this.name);
    } 
}
