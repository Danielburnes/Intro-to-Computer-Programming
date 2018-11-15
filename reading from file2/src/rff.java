public class rff {
         public static void main(string[]args)
         {

          scanner tread = new scanner(system.in);//
          string word = "", pig;
          char first;
          boolean next_line_exists;

          do {
              {
                  system.out.print("please enter english Word");

           //read line; make sure it is not empty
           next_line_exists = tread.hasnextline();
           if(next_line_exists)

           {
               string line =tread next line();
               if (!line.isEmpty())
               {
               //split the string and grab first word
               string[] word_array=line.split("");
               word = wrod_array{0};
               word = word.touppercase();
               system.out.println(word);


               first=word.charat(0);
               if(first =='a' || first == 'e' || first == 'i' ||
               first == 'o' || first == 'u'u// vowel
               pig = word +"hay";
               else
                   pig=word sub.string(1) + word.charat(0) + "ay"
               system.out.println("PIG-LATIN;" + pig);
               }
           }
              }
          }while( next_line_exists );// )
               }
           }
              }
          }
    }
}
