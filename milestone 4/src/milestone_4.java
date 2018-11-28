public class milestone_4 {
    public class Player{
        private string firstname;
        private string lastname;
        private string position;
        private string age;
        private string height;
        private string weight;
        public player(string firstname, string lastname,
                      int position, string age, string height, string weight)
              super()
              this.firstname = firstname;
              this.lastname = lastname;
              this.position = position;
              this.age = age;
              this.height = height;
              this.weight = weight;

    //No args constructor
     public player() {
         super();
         system.out.println("No args constructor called");

     }
    }

}
