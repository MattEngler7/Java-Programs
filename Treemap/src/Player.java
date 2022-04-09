public class Player {

       private int national_rank;
       private String name;
       private String height;
       private String weight;
       private String yard_dash_time;

       public Player(int national_rank, String name, String height, String weight, String dash_time)

       {
             this.national_rank = national_rank;
             this.name = name;
             this.height = height;
             this.weight = weight;
             this.yard_dash_time = dash_time;
       }
       
       public void setNationalRank(int national_rank)
       {
             this.national_rank = national_rank;
       }      
       
       public void setName(String name)

       {
             this.name = name;
       }

      

       public void setHeight(String height)
       {
             this.height = height;
       }

       public void setWeight(String weight)
       {
             this.weight = weight;
       }

      

       public void setYardDashTime(String dash_time)
       {
             this.yard_dash_time = dash_time;
       }

      

       public int getNationalRank()
       {
             return national_rank;
       }

       public String getName()
       {
             return name;
       }

       public String getHeight()
       {
             return height;
       }

       public String getWeight()
       {
             return weight;
       }

       public String getYardDashTime()
       {
             return yard_dash_time;
       }

       public String toString()
       {
             return("National Rank : "+national_rank+" Name : "+name+" Height : "+height+" Weight : "+weight+" 40 yard dash time :"+yard_dash_time);
       }     

}