import java.util.*;
class Main {
  public enum Weather{Sun, Cloudy, Rainy, Snow};
  public enum Genre{Rap, RnB, Pop, Indie, Classical, Rock, EDM};
  
  public static ArrayList<String> recommendGenre(ArrayList<Weather> weatherData, ArrayList<Genre> genreData){
      ArrayList<String> songs = new ArrayList<>();
      
      for(int i = 0;i<weatherData.size();i++){
        for(int j = 0; j<genreData.size(); j++){
          switch(weatherData.get(i)){
            // Sunny
            case Sun:
              switch(genreData.get(j)){
                // Rap
                case Rap:
                   songs.add("Insert Rap song");
                // RnB
                case RnB:
                    songs.add("Insert RnB song");
                //Pop
                case Pop: 
                    songs.add("Insert happy poppy song");
                //Indie
                case Indie: 
                    songs.add("Insert happy Indie song");
                //Classical
                case Classical: 
                    songs.add("Insert happy classical song");
                //Rock
                case Rock: 
                    songs.add("Insert upbeat rock song");
                //EDM
                case EDM:
                    songs.add("Insert upbeat EDM song");
              }
              // Cloudy
            case Cloudy:
                switch(genreData.get(j)){
                // Rap
                case Rap:
                  songs.add("Insert mellow rap song");
                // RnB
                case RnB:
                  songs.add("Insert mellow RnB song");
                //Pop
                case Pop: 
                  songs.add("Insert midtempo pop song");
                //Indie
                case Indie: 
                  songs.add("Insert chill indie  song");
                //Classical
                case Classical: 
                  songs.add("Insert productive classical song");
                //Rock
                case Rock: 
                  songs.add("Insert chill rock song");
                //EDM
                case EDM:
                  songs.add("Insert light EDM song");
              }
            // Rainy
            case Rainy: 
              switch(genreData.get(j)){
                // Rap
                case Rap:
                   songs.add("Insert sad rap song");
                // RnB
                case RnB:
                   songs.add("Insert sad rnb song");
                //Pop
                case Pop: 
                   songs.add("Insert sad/relaxed pop song");
                //Indie
                case Indie: 
                   songs.add("Insert  rap song");
                //Classical
                case Classical: 
                //Rock
                case Rock: 
                //EDM
                case EDM:
              }
            // Snow
            case Snow:
              switch(genreData.get(j)){
                // Rap
                case Rap:
                   songs.add("Insert chill rap song");
                // RnB
                case RnB:
                   songs.add("Insert chill rnb song");
                //Pop
                case Pop: 
                   songs.add("Insert holiday/chill pop song");
                //Indie
                case Indie: 
                   songs.add("Insert sad indie song");
                //Classical
                case Classical: 
                   songs.add("Insert sad classical song");
                //Rock
                case Rock: 
                   songs.add("Insert a chill rock song");
                //EDM
                case EDM:         
                   songs.add("Insert sad EDM song");                     
              }
          }
        }
      }
      return songs;
  }
  // Weather will be connected to numbers 
  // 0 = Sunny, 1 = Cloudy, 2 = Rain, 3 = Snow
  // Genres will be connected to numbers
  //Things withs with Lyrics, things without Lyrics.
  // 0 = Rap, 1 = RnB, 2 = Pop, 3 = Indie, 4 = Classical
  // 5 = Rock, 6 = EDM
  public static void main(String[] args) {
    ArrayList<Weather> fakeweather = new ArrayList<>();
    fakeweather.add(Weather.Cloudy);
    fakeweather.add(Weather.Rainy);
    
    ArrayList<Genre> fakeuserinput = new ArrayList<>();
    fakeuserinput.add(Genre.Rap);
    fakeuserinput.add(Genre.Indie);
    fakeuserinput.add(Genre.Classical);
    
    ArrayList<String> fakegeo = new ArrayList<>();
    
    ArrayList<String> answer =  recommendGenre(fakeweather, fakeuserinput);
        System.out.println(answer);
  }
 
  


  
}