package quiz;


public class QuestionSets {
//	static String Question;
//	static String Option1,Option2,Option3,Option4;
	static int QuestionNo;
	QuestionSets(){
		
	}
	QuestionSets(int n){
		if(n==0) {QuestionNo =(int)(Math.random()*9)+1;}
                else if(n==1)
                { QuestionNo =((int)(Math.random()*9))+10;
                }
                else if(n==2)
                { QuestionNo =((int)(Math.random()*9))+19;
                }
                else if(n==3)
                { QuestionNo =((int)(Math.random()*9))+28;
                }
                else if(n==4)
                { QuestionNo =((int)(Math.random()*9))+37;
                }
                else if(n==5)
                { QuestionNo =((int)(Math.random()*9))+46;
                }
	}
	
	public String getQuestion() {
		if(QuestionNo == 1){
			return "Who played the female lead role in Alfonso Cuaron's 2013 film-'Gravity'?";
		}
		else if(QuestionNo==2){
			return "Walt Disney's film-'Finding Nemo' was released in which year?";
		}
                else if(QuestionNo==3){
			return "Which studio produced the 2012 film-'Avengers'?";
                                }
                else if(QuestionNo==4){
			return "Who directed the 2009 film-'Avatar'?";
                                }
                else if(QuestionNo==5){
			return "Wich Studio produced the 2008 film 'Wall-E'?";
                                }
                else if(QuestionNo==6){
			return "Who Played the lead role in Christopher Nolan's 2010 film-'Inception'?";
                                }
                else if(QuestionNo==7){
			return "Who directed the 'LORD OF THE RINGS'-Film series?";
                                }
                else if(QuestionNo==8){
			return "Frank Darabont's 'The Shawkshank Redemption' was released in which year?";
                                }
                else if(QuestionNo==9){
			return "Who played the lead role in Martin Scorcese's 2013 film 'The Wolf of Wall Street'?";
                                }
                else if(QuestionNo == 10){
			return "'Keep your friends close, but your enemies closer.'was quoted by the character Michael Corleone in the film-'The Godfather:Part II'.Who portrayed the character Michael Corleone in that film?";
		}
                else if(QuestionNo == 11){
			return "Which actress won the Academy award for best actress in 2014?";
		}
                else if(QuestionNo == 12){
			return "Which film won the Academy award for best Foreign Language film in 2014?";
		}
                else if(QuestionNo == 13){
			return "Quentin Tarantino directed which film?";
		}
                else if(QuestionNo == 14){
			return "Who directed the 1982 science fiction film 'E.T'?";
		}
                else if(QuestionNo == 15){
			return "In which film Leonardo Dicaprio played the lead role?";
		}
                else if(QuestionNo == 16){
			return "Which is first film of the famous 'James Bond' series?";
		}
                else if(QuestionNo == 17){
			return "In which film Robin Williams have played a role?";
		}
                else if(QuestionNo == 18){
			return "Who Played the lead role in David FIncher's 1995 film-'Se7en'?";
		}
                else if(QuestionNo == 19){
			return "Who was the youngest actor to have won an Academy Award for Best Actor?";
		}
                else if(QuestionNo == 20){
			return "Who was declared as 'The Greatest Film Star of All TIme'-by Empire magazine?";
		}
                else if(QuestionNo == 21){
			return "Steven Sprielberg's adventure film 'The Adventure of Tintin' was released in which year?";
		}
                else if(QuestionNo == 22){
			return "Who is known as the-'Master of Suspense'?";
		}
                else if(QuestionNo == 23){
			return "Who directed the 1980 film-'Raging Bull',based on the memoir of Boxer Jake LaMotta.";
		}
                else if(QuestionNo == 24){
			return "Who Played the lead role in Ridley Scott's 1982 film-'Blade Runner'?";
		}
                else if(QuestionNo == 25){
			return "Who directed the 'Star Wars' -film series?";
		}
                else if(QuestionNo == 26){
			return "Who directed the 2012 film-'Django Unchained'?";
		}
                else if(QuestionNo == 27){
			return "Which film have won the most number of oscars?";
		}
                else if(QuestionNo == 28){
			return "'You've got to ask yourself one question:\n" +
"'Do I feel lucky?' Well, do ya, punk?'-is quoted by Inspector 'Dirty' \n" +
"Harry Callahan in Don Siegel's 1971 film-'Dirty Harry'.Who portrayed the \n" +
"character of Harry Callahan in that film?";
		}
                else if(QuestionNo == 29){
			return "\"In spite of everything, I still believe that\n" +
"people are really good at heart.\"-this quotation was taken from which \n" +
"film?";
		}
                else if(QuestionNo == 30){
			return "Who directed the 1988 Indian film 'Salaam Bombay'?";
		}
                else if(QuestionNo == 31){
			return "In which film Leonardo DiCaprio played the lead role?";
		}
                else if(QuestionNo == 32){
			return "Which film was based on the story of the body double of Iraqi former president Saddam Hussein's son Uday Hussein?";
		}
                else if(QuestionNo == 33){
			return "'Go Ahead,Make My Day'-was quoted by which actor?";
		}
                else if(QuestionNo == 34){
			return "\"All-righty then!\" is quoted by which famous movie character?";
		}
                else if(QuestionNo == 35){
			return "\"They may take away our lives, but they'll\n" +
"never take our freedom!\"-was quoted by William Wallace in which film? The \n" +
"Character 'William Wallace' was portrayed by actor Mel Gibson.";
		}
                else if(QuestionNo == 36){
			return "Who directed the 2001 film-'In the Mood For Love'?";
		}
                else if(QuestionNo == 37){
			return "Which film won the first Oscar prize ever in best Picture Category?";
		}
                else if(QuestionNo == 38){
			return "Who played the lead role 1976 film-'Rocky'?";
		}
                else if(QuestionNo == 39){
			return "Chistopher Nolan's 2010 film 'Inception' was influenced by which film?";
		}
                else if(QuestionNo == 40){
			return "Who played the lead role in Victor Fleming's 1939 film- 'The Wizard of Oz'?";
		}
                else if(QuestionNo == 41){
			return "'Kid, the next time I say, “Let's go\n" +
"someplace like Bolivia,” let's go someplace\n" +
"like Bolivia.'-this quotation was taken from which film?\n" +
" ";
		}
                else if(QuestionNo == 42){
			return "\"Roads? Where we're going we don't need\n" +
"roads.\"-was quoted by the character 'Dr. Emmett Brown' in which film?";
		}
                else if(QuestionNo == 43){
			return "\"I know it was you, Fredo. You broke my\n" +
"heart. You broke my heart.\"was quoted by the character Michael Corleone in the film-\"The Godfather:Part II\".Who was the director of that film?";
		}
                else if(QuestionNo == 44){
			return "\"We came. We saw. We kicked its ass.\" was quoted by the character DR. PETER VENKMAN in Ivan Reitman's 1984 Film 'Ghostbusters'.Who portrayed the character DR. PETER VENKMAN in that film?";
		}
                else if(QuestionNo == 45){
			return "\"Have you ever danced with the Devil in the\n" +
"pale moonlight?\"-was quoted by which character in the 'Batman' film series?";
		}
                else if(QuestionNo == 46){
			return "\"Fasten your seatbelts. It's going to be a\n" +
"bumpy night.\"-is a famous movie quotation.From which film this quotation was taken?";
		}
                else if(QuestionNo == 47){
			return "\"And our bodies are earth. And our thoughts\n" +
"are clay. And we sleep and eat with death.\"-From Which film this quotation was taken from?";
		}
                else if(QuestionNo == 48){
			return "\"We rob banks.\"-was quoted by the character Clyde barrow in Arthur Penn's 1967 film 'Bonnie and Clyde'.Who portrayed the character 'Clyde barrow'?";
		}
                else if(QuestionNo == 49){
			return "'Play it, Sam. Play “As Time Goes By.”'-was quoted by the character Ilsa Laszlo.Which actress portrayed the character Ilsa Laszlo in the1942 film-'Casablanca'?";
		}
                else if(QuestionNo == 50){
			return "\"Of all the gin joints in all the towns in\n" +
"all the world, she walks into mine.\"-quoted by which actor in 1942 film-'Casablanca'?";
		}
                else if(QuestionNo == 51){
			return "\"Forget it, Jake. It’s Chinatown.\"-was quoted by the Character 'Duffy' in 1974 film 'Chinatown'.Who directed this famous film?";
		}
                else if(QuestionNo == 52){
			return "\"Rosebud.\"-was quoted by the charcter Charles Foster Kane,portrayed by Orson Welles.What is the name of the Film?";
		}
                else if(QuestionNo == 53){
			return "\"What we've got here is failure to\n" +
"communicate.\"-was quoted by actor Strother Martin in which film?";
		}
                else if(QuestionNo == 54){
			return "\"Gentlemen, you can't fight in here! This is\n" +
"the War Room!\"-this quotation was taken from which film?";
		}
                
		else return "";
	}
	
	public String getOption1() {
		if(QuestionNo==1) {
			return "Julia Roberts";
		}
		else if(QuestionNo == 2){
			return "2000";
		}
                else if(QuestionNo == 3){
			return "DC";
		}
                else if(QuestionNo == 4){
			return "Steven Spielberg";
		}
                else if(QuestionNo == 5){
			return "Marvel";
		}
                else if(QuestionNo == 6){
			return "Leonardo DiCaprio";
		}
                else if(QuestionNo == 7){
			return "Steven Spielberg";
		}
                else if(QuestionNo == 8){
			return "1996";
		}
                else if(QuestionNo == 9){
			return "Tom Cruise";
		}
                else if(QuestionNo == 10){
			return "Clint Eastwood";
		}
                else if(QuestionNo == 11){
			return "Resse Witherspoon";
		}
                else if(QuestionNo == 12){
			return "The Hunt";
		}
                else if(QuestionNo == 13){
			return "Planet Terror";
		}
                else if(QuestionNo == 14){
			return "Steven Spielberg";
		}
                else if(QuestionNo == 15){
			return "The Aviator";
		}
                else if(QuestionNo == 16){
			return "You only Live Twice";
		}
                else if(QuestionNo == 17){
			return "Death of a Superhero";
		}
                else if(QuestionNo == 18){
			return "Brad Pitt";
		}
                else if(QuestionNo == 19){
			return "Tom Hanks";
		}
                else if(QuestionNo == 20){
			return "Clint Eastwood";
		}
                else if(QuestionNo == 21){
			return "2010";
		}
                else if(QuestionNo == 22){
			return "John Carpenter";
		}
                else if(QuestionNo == 23){
			return "Martin Scorcese";
		}
                else if(QuestionNo == 24){
			return "Rutger Hauer";
		}
                else if(QuestionNo == 25){
			return "Frank Miller";
		}
                else if(QuestionNo == 26){
			return "Robert Rodriguez";
		}
                else if(QuestionNo == 27){
			return "Ben-Hur";
		}
                else if(QuestionNo == 28){
			return "Clint Eastwood";
		}
                else if(QuestionNo == 29){
			return "The Diary Of Anne Frank";
		}
                else if(QuestionNo == 30){
			return "Deepa Mehta";
		}
                else if(QuestionNo == 31){
			return "The Aviator";
		}
                else if(QuestionNo == 32){
			return "The Devil's Double";
		}
                else if(QuestionNo == 33){
			return "Harrison Ford";
		}
                else if(QuestionNo == 34){
			return "Ace Ventura";
		}
                else if(QuestionNo == 35){
			return "The Last of the Mohicans";
		}
                else if(QuestionNo == 36){
			return "Kinji Fukasaku";
		}
                else if(QuestionNo == 37){
			return "Wings";
		}
                else if(QuestionNo == 38){
			return "Bruce Willis";
		}
                else if(QuestionNo == 39){
			return "Paprika";
		}
                else if(QuestionNo == 40){
			return "Lillian Gish";
		}
                else if(QuestionNo == 41){
			return "Butch Cassidy & The Sundance Kid";
		}
                else if(QuestionNo == 42){
			return "Back to the Future";
		}
                else if(QuestionNo == 43){
			return "Sam Mendes";
		}
                else if(QuestionNo == 44){
			return "Dan Aykroyd";
		}
                else if(QuestionNo == 45){
			return "Batman";
		}
                else if(QuestionNo == 46){
			return "Sullivan's Travels";
		}
                else if(QuestionNo == 47){
			return "The Life of Emile Zola";
		}
                else if(QuestionNo == 48){
			return "Kevin Kline";
		}
                else if(QuestionNo == 49){
			return "Ingrid Bergman";
		}
                else if(QuestionNo == 50){
			return "Humphrey Bogart";
		}
                else if(QuestionNo == 51){
			return "Roman Polanski";
		}
                else if(QuestionNo == 52){
			return "Citizen kane";
		}
                else if(QuestionNo == 53){
			return "Cool Hand Luke";
		}
                else if(QuestionNo == 54){
			return "Dr. Strangelove";
		}
                
		else return "";
	}
	
	public String getOption2() {
		if(QuestionNo==1) {
			return "Sandra Bullock";
		}
		else if(QuestionNo == 2){
			return "1998";
		}
                else if(QuestionNo == 3){
			return "Marvel";
		}
                else if(QuestionNo == 4){
			return "James Cameron";
		}
                else if(QuestionNo == 5){
			return "Pixar";
		}
                else if(QuestionNo == 6){
			return "Brad Pitt";
		}
                else if(QuestionNo == 7){
			return "Bryan Singer";
		}
                else if(QuestionNo == 8){
			return "1990";
		}
                else if(QuestionNo == 9){
			return "Mark Wahlberg";
		}
                else if(QuestionNo == 10){
			return "Al Pacino";
		}
                else if(QuestionNo == 11){
			return "Jennifer Lawrence";
		}
                else if(QuestionNo == 12){
			return "The Great Beauty";
		}
                else if(QuestionNo == 13){
			return "Pulp Fiction";
		}
                else if(QuestionNo == 14){
			return "Ridley Scott";
		}
                else if(QuestionNo == 15){
			return "Munich";
		}
                else if(QuestionNo == 16){
			return "Dr No";
		}
                else if(QuestionNo == 17){
			return "Bloodsport";
		}
                else if(QuestionNo == 18){
			return "Joseph Fiennes";
		}
                else if(QuestionNo == 19){
			return "Daniel Day Lewis";
		}
                else if(QuestionNo == 20){
			return "Marlon Brando";
		}
                else if(QuestionNo == 21){
			return "2012";
		}
                else if(QuestionNo == 22){
			return "Wes Craven";
		}
                else if(QuestionNo == 23){
			return "Stanley Kubrick";
		}
                else if(QuestionNo == 24){
			return "Harrison Ford";
		}
                else if(QuestionNo == 25){
			return "George Lucas";
		}
                else if(QuestionNo == 26){
			return "Quentin Tarantino";
		}
                else if(QuestionNo == 27){
			return "Titanic";
		}
                else if(QuestionNo == 28){
			return "Steve McQueen";
		}
                else if(QuestionNo == 29){
			return "Black Book";
		}
                else if(QuestionNo == 30){
			return "Mira Nair";
		}
                else if(QuestionNo == 31){
			return "Munich";
		}
                else if(QuestionNo == 32){
			return "The Double";
		}
                else if(QuestionNo == 33){
			return "James Coburn";
		}
                else if(QuestionNo == 34){
			return "Terry Mackay";
		}
                else if(QuestionNo == 35){
			return "The English Patient";
		}
                else if(QuestionNo == 36){
			return "Ramin Bahrani";
		}
                else if(QuestionNo == 37){
			return "ALL QUIET ON THE WESTERN FRONT";
		}
                else if(QuestionNo == 38){
			return "Sylvester Stallone";
		}
                else if(QuestionNo == 39){
			return "Dreams";
		}
                else if(QuestionNo == 40){
			return "Jean Harlow";
		}
                else if(QuestionNo == 41){
			return "The Color of Money";
		}
                else if(QuestionNo == 42){
			return "Invasion of the Body Snatchers";
		}
                else if(QuestionNo == 43){
			return "Sergio Leone";
		}
                else if(QuestionNo == 44){
			return "Jeff Goldblum";
		}
                else if(QuestionNo == 45){
			return "Robin";
		}
                else if(QuestionNo == 46){
			return "Sunset Blvd.";
		}
                else if(QuestionNo == 47){
			return "The General";
		}
                else if(QuestionNo == 48){
			return "Steve McQueen";
		}
                else if(QuestionNo == 49){
			return "Ingrid Bergman";
		}
                else if(QuestionNo == 50){
			return "Burt Lancaster";
		}
                else if(QuestionNo == 51){
			return "Roman Polanski";
		}
                else if(QuestionNo == 52){
			return "Citizen kane";
		}
                else if(QuestionNo == 53){
			return "Play Misty FOr Me";
		}
                else if(QuestionNo == 54){
			return "Patton";
		}
                
		else return "";
	}
	
	public String getOption3() {
		if(QuestionNo==1) {
			return "Sharon Stone";
		}
		else if(QuestionNo == 2){
			return "2003";
		}
                else if(QuestionNo == 3){
			return "Universal";
		}
                else if(QuestionNo == 4){
			return "Ridley Scott";
		}
                else if(QuestionNo == 5){
			return "Dreamworks";
		}
                else if(QuestionNo == 6){
			return "Tom Cruise";
		}
                else if(QuestionNo == 7){
			return "Peter Jackson";
		}
                else if(QuestionNo == 8){
			return "1992";
		}
                else if(QuestionNo == 9){
			return "Leonardo DiCaprio";
		}
                else if(QuestionNo == 10){
			return "Charles Bronson";
		}
                else if(QuestionNo == 11){
			return "Cate Blanchett";
		}
                else if(QuestionNo == 12){
			return "The Past";
		}
                else if(QuestionNo == 13){
			return "El Mariachi";
		}
                else if(QuestionNo == 14){
			return "James Cameron";
		}
                else if(QuestionNo == 15){
			return "Into The Wild";
		}
                else if(QuestionNo == 16){
			return "Diamonds Are Forever";
		}
                else if(QuestionNo == 17){
			return "Jumanji";
		}
                else if(QuestionNo == 18){
			return "Jude Law";
		}
                else if(QuestionNo == 19){
			return "Clark Gable";
		}
                else if(QuestionNo == 20){
			return "Harrison Ford";
		}
                else if(QuestionNo == 21){
			return "2008";
		}
                else if(QuestionNo == 22){
			return "Alfred Hitchcock";
		}
                else if(QuestionNo == 23){
			return "Milos Forman";
		}
                else if(QuestionNo == 24){
			return "Clint Eastwood";
		}
                else if(QuestionNo == 25){
			return "James Cameron";
		}
                else if(QuestionNo == 26){
			return "Richard Linklater";
		}
                else if(QuestionNo == 27){
			return "LORD OF THE RINGS:The Return Of the King";
		}
                else if(QuestionNo == 28){
			return "James Coburn";
		}
                else if(QuestionNo == 29){
			return "Under The Skin";
		}
                else if(QuestionNo == 30){
			return "Ram Gopal Verma";
		}
                else if(QuestionNo == 31){
			return "Into The Wild";
		}
                else if(QuestionNo == 32){
			return "Three Kings";
		}
                else if(QuestionNo == 33){
			return "Steve McQueen";
		}
                else if(QuestionNo == 34){
			return "Guy Holden";
		}
                else if(QuestionNo == 35){
			return "Braveheart";
		}
                else if(QuestionNo == 36){
			return "Yimou Zhang";
		}
                else if(QuestionNo == 37){
			return "";
		}
                else if(QuestionNo == 38){
			return "Charles Bronson";
		}
                else if(QuestionNo == 39){
			return "Suspiria";
		}
                else if(QuestionNo == 40){
			return "Judy Garland";
		}
                else if(QuestionNo == 41){
			return "The Motorcycle Diaries";
		}
                else if(QuestionNo == 42){
			return "The Day The Earth Stood Still";
		}
                else if(QuestionNo == 43){
			return "Francis Ford Coppola";
		}
                else if(QuestionNo == 44){
			return "Sam Riley";
		}
                else if(QuestionNo == 45){
			return "Catwomen";
		}
                else if(QuestionNo == 46){
			return "All About Eve";
		}
                else if(QuestionNo == 47){
			return "Wings";
		}
                else if(QuestionNo == 48){
			return "Warren Beatty";
		}
                else if(QuestionNo == 49){
			return "Lauren Bacall";
		}
                else if(QuestionNo == 50){
			return "Tony Curtis";
		}
                else if(QuestionNo == 51){
			return "David Cronenberg";
		}
                else if(QuestionNo == 52){
			return "City Lights";
		}
                else if(QuestionNo == 53){
			return "Alien";
		}
                else if(QuestionNo == 54){
			return "The Longest Day";
		}
                
		else return "";
	}
	
	
	public String getOption4() {
		if(QuestionNo==1) {
			return "Jessica Chastain";
		}
		else if(QuestionNo == 2){
			return "2002";
		}
                else if(QuestionNo == 3){
			return "Dreamworks";
		}
                else if(QuestionNo == 4){
			return "Christopher Nolan";
		}
                else if(QuestionNo == 5){
			return "Universal";
		}
                else if(QuestionNo == 6){
			return "Christian Bale";
		}
                else if(QuestionNo == 7){
			return "John Carpenter";
		}
                else if(QuestionNo == 8){
			return "None Of The Above";
		}
                else if(QuestionNo == 9){
			return "Eric Bana";
		}
                else if(QuestionNo == 10){
			return "Dustin Hoffman";
		}
                else if(QuestionNo == 11){
			return "Tilda Swinton";
		}
                else if(QuestionNo == 12){
			return "The Selfish Giant";
		}
                else if(QuestionNo == 13){
			return "Natural Born Killers";
		}
                else if(QuestionNo == 14){
			return "Bryan Singer";
		}
                else if(QuestionNo == 15){
			return "Collateral";
		}
                else if(QuestionNo == 16){
			return "On Her Majesty's Secret Service";
		}
                else if(QuestionNo == 17){
			return "Dredd";
		}
                else if(QuestionNo == 18){
			return "Val Kilmer";
		}
                else if(QuestionNo == 19){
			return "Adrien Brody";
		}
                else if(QuestionNo == 20){
			return "Humphrey Bogart";
		}
                else if(QuestionNo == 21){
			return "2011";
		}
                else if(QuestionNo == 22){
			return "None of the above";
		}
                else if(QuestionNo == 23){
			return "Francis Ford Coppola";
		}
                else if(QuestionNo == 24){
			return "Sean Connery";
		}
                else if(QuestionNo == 25){
			return "George Miller ";
		}
                else if(QuestionNo == 26){
			return "None Of the above";
		}
                else if(QuestionNo == 27){
			return "All of the above";
		}
                else if(QuestionNo == 28){
			return "Charles Bronson";
		}
                else if(QuestionNo == 29){
			return "The Longest Day";
		}
                else if(QuestionNo == 30){
			return "Anurag Kashyup";
		}
                else if(QuestionNo == 31){
			return "Collateral";
		}
                else if(QuestionNo == 32){
			return "Jarhead";
		}
                else if(QuestionNo == 33){
			return "Clint Eastwood";
		}
                else if(QuestionNo == 34){
			return "Sam Wheat";
		}
                else if(QuestionNo == 35){
			return "Dances with Wolves";
		}
                else if(QuestionNo == 36){
			return "Kar Wai Wong";
		}
                else if(QuestionNo == 37){
			return "Grand Hotel";
		}
                else if(QuestionNo == 38){
			return "James Coburn";
		}
                else if(QuestionNo == 39){
			return "None of The Above";
		}
                else if(QuestionNo == 40){
			return "Ava Gardner";
		}
                else if(QuestionNo == 41){
			return "Honkytonk Man";
		}
                else if(QuestionNo == 42){
			return "Close Encounters of the Third Kind";
		}
                else if(QuestionNo == 43){
			return "Frank Capra";
		}
                else if(QuestionNo == 44){
			return "Bill Murray";
		}
                else if(QuestionNo == 45){
			return "The Joker";
		}
                else if(QuestionNo == 46){
			return "Ivan The Terrible-Part II";
		}
                else if(QuestionNo == 47){
			return "All Quiet on the Western Front ";
		}
                else if(QuestionNo == 48){
			return "Tony Curtis";
		}
                else if(QuestionNo == 49){
			return "Donna Reed";
		}
                else if(QuestionNo == 50){
			return "Clark Gable";
		}
                else if(QuestionNo == 51){
			return "Martin Scorcese";
		}
                else if(QuestionNo == 52){
			return "The Grapes of Wrath";
		}
                else if(QuestionNo == 53){
			return "The Day the Earth Stood Still";
		}
                else if(QuestionNo == 54){
			return "None of the above";
		}
                
		else return "";
	}
	
	public static int RightAns() {
		if(QuestionNo==1) {
			return 2;
		}
		else if(QuestionNo == 2){
			return 3;
		}
                else if(QuestionNo == 3){
			return 2;
		}
                else if(QuestionNo == 4){
			return 2;
		}
                else if(QuestionNo == 5){
			return 2;
		}
                else if(QuestionNo == 6){
			return 1;
		}
                else if(QuestionNo == 7){
			return 3;
		}
                else if(QuestionNo == 8){
			return 4;
		}
                else if(QuestionNo == 9){
			return 3;
		}
                else if(QuestionNo == 10){
			return 2;
		}
                else if(QuestionNo == 11){
			return 3;
		}
                else if(QuestionNo == 12){
			return 2;
		}
                else if(QuestionNo == 13){
			return 2;
		}
                else if(QuestionNo == 14){
			return 1;
		}
                else if(QuestionNo == 15){
			return 1;
		}
                else if(QuestionNo == 16){
			return 2;
		}
                else if(QuestionNo == 17){
			return 3;
		}
                else if(QuestionNo == 18){
			return 1;
		}
                else if(QuestionNo == 19){
			return 4;
		}
                else if(QuestionNo == 20){
			return 3;
		}
                else if(QuestionNo == 21){
			return 4;
		}
                else if(QuestionNo == 22){
			return 3;
		}
                else if(QuestionNo == 23){
			return 1;
		}
                else if(QuestionNo == 24){
			return 2;
		}
                else if(QuestionNo == 25){
			return 2;
		}
                else if(QuestionNo == 26){
			return 2;
		}
                else if(QuestionNo == 27){
			return 4;
		}
                else if(QuestionNo == 28){
			return 1;
		}
                else if(QuestionNo == 29){
			return 1;
		}
                else if(QuestionNo == 30){
			return 2;
		}
                else if(QuestionNo == 31){
			return 1;
		}
                else if(QuestionNo == 32){
			return 1;
		}
                else if(QuestionNo == 33){
			return 4;
		}
                else if(QuestionNo == 34){
			return 1;
		}
                else if(QuestionNo == 35){
			return 3;
		}
                else if(QuestionNo == 36){
			return 4;
		}
                else if(QuestionNo == 37){
			return 1;
		}
                else if(QuestionNo == 38){
			return 2;
		}
                else if(QuestionNo == 39){
			return 1;
		}
                else if(QuestionNo == 40){
			return 3;
		}
                else if(QuestionNo == 41){
			return 1;
		}
                else if(QuestionNo == 42){
			return 1;
		}
                else if(QuestionNo == 43){
			return 3;
		}
                else if(QuestionNo == 44){
			return 4;
		}
                else if(QuestionNo == 45){
			return 4;
		}
                else if(QuestionNo == 46){
			return 3;
		}
                else if(QuestionNo == 47){
			return 4;
		}
                else if(QuestionNo == 48){
			return 3;
		}
                else if(QuestionNo == 49){
			return 1;
		}
                else if(QuestionNo == 50){
			return 1;
		}
                else if(QuestionNo == 51){
			return 1;
		}
                else if(QuestionNo == 52){
			return 1;
		}
                else if(QuestionNo == 53){
			return 1;
		}
                else if(QuestionNo == 54){
			return 1;
		}
                
		else return 0 ;
        
	}
        public String getRightAns()
        {
        
        if(QuestionNo==1) {
			return "Sandra Bullock";
		}
		else if(QuestionNo == 2){
			return "2003";
		}
                else if(QuestionNo == 3){
			return "Marvel";
		}
                else if(QuestionNo == 4){
			return "James Cameron";
		}
                else if(QuestionNo == 5){
			return "Pixar";
		}
                else if(QuestionNo == 6){
			return "Leonardo DiCaprio";
		}
                else if(QuestionNo == 7){
			return "Peter Jackson";
		}
                else if(QuestionNo == 8){
			return "None Of The Above";
		}
                else if(QuestionNo == 9){
			return "Leonardo DiCaprio";
		}
                else if(QuestionNo == 10){
			return "Al Pacino";
		}
                else if(QuestionNo == 11){
			return "Cate Blanchett";
		}
                else if(QuestionNo == 12){
			return "The Great Beauty";
		}
                else if(QuestionNo == 13){
			return "Pulp Fiction";
		}
                else if(QuestionNo == 14){
			return "Steven Spielberg";
		}
                else if(QuestionNo == 15){
			return "The Aviator";
		}
                else if(QuestionNo == 16){
			return "Dr No";
		}
                else if(QuestionNo == 17){
			return "Jumanji";
		}
                else if(QuestionNo == 18){
			return "Brad Pitt";
		}
                else if(QuestionNo == 19){
			return "Adrien Brody";
		}
                else if(QuestionNo == 20){
			return "Harrison Ford";
		}
                else if(QuestionNo == 21){
			return "2011";
		}
                else if(QuestionNo == 22){
			return "Alfred Hitchcock";
		}
                else if(QuestionNo == 23){
			return "Martin Scorcese";
		}
                else if(QuestionNo == 24){
			return "Harrison Ford";
		}
                else if(QuestionNo == 25){
			return "George Lucas";
		}
                else if(QuestionNo == 26){
			return "Quentin Tarantino";
		}
                else if(QuestionNo == 27){
			return "All of the above";
		}
                else if(QuestionNo == 28){
			return "Clint Eastwood";
		}
                else if(QuestionNo == 29){
			return "The Diary Of Anne Frank";
		}
                else if(QuestionNo == 30){
			return "Mira Nair";
		}
                else if(QuestionNo == 31){
			return "The Aviator";
		}
                else if(QuestionNo == 32){
			return "The Devil's Double";
		}
                else if(QuestionNo == 33){
			return "Clint Eastwood";
		}
                else if(QuestionNo == 34){
			return "Ace Ventura";
		}
                else if(QuestionNo == 35){
			return "Braveheart";
		}
                else if(QuestionNo == 36){
			return "Kar Wai Wong";
		}
                else if(QuestionNo == 37){
			return "Wings";
		}
                else if(QuestionNo == 38){
			return "Sylvester Stallone";
		}
                else if(QuestionNo == 39){
			return "Paprika";
		}
                else if(QuestionNo == 40){
			return "Judy Garland";
		}
                else if(QuestionNo == 41){
			return "Butch Cassidy & The Sundance Kid";
		}
                else if(QuestionNo == 42){
			return "Back to the Future";
		}
                else if(QuestionNo == 43){
			return "Francis Ford Coppola";
		}
                else if(QuestionNo == 44){
			return "Bill Murray";
		}
                else if(QuestionNo == 45){
			return "The Joker";
		}
                else if(QuestionNo == 46){
			return "All About Eve";
		}
                else if(QuestionNo == 47){
			return "All Quiet on the Western Front ";
		}
                else if(QuestionNo == 48){
			return "Tony Curtis";
		}
                else if(QuestionNo == 49){
			return "Ingrid Bergman";
		}
                else if(QuestionNo == 50){
			return "Humphrey Bogart";
		}
                else if(QuestionNo == 51){
			return "Roman Polanski";
		}
                else if(QuestionNo == 52){
			return "Citizen kane";
		}
                else if(QuestionNo == 53){
			return "Cool Hand Luke";
		}
                else if(QuestionNo == 54){
			return "Dr. Strangelove";
		}
                
		else return "";
        
        
        }
        
        
        public static String getHint(int n)
        {
            int QuestionNo=n;   
            if(QuestionNo==1) {
                   return "She won the Academy award for best actress for the 2009 film 'The Blind Side'.";
		}
		else if(QuestionNo == 2){
			return "In that year Peter Jackson's 'Lord of the Rings:The Return of the King'-won the academy award for best picture.";
		}
                else if(QuestionNo == 3){
			return "This studio also produced films like Iron Man,Captain America etc.";
		}
                else if(QuestionNo == 4){
			return "He also directed the first three films of 'Terminator'-series.";
		}
                else if(QuestionNo == 5){
			return "This studio also produced films like Finding Nemo,Up,The Incredibles.";
		}
                else if(QuestionNo == 6){
			return "He also played the lead role in Baz Luhrmann's 2013 film 'The Great Gatsby'.";
		}
                else if(QuestionNo == 7){
			return "He also directed the 2005 film 'King Kong'.";
		}
                else if(QuestionNo == 8){
			return "Robert Zemeckis's \"Forrest Gump\" won the Academy Award for Best Picture in that year.";
		}
                else if(QuestionNo == 9){
			return "He played the male lead role in James Cameron's 1998 epic 'Titanic'.";
		}
                else if(QuestionNo == 10){
			return "The Actor played the lead role in Martin Brest's 1992 film-'Scent of a Woman'.";
		}
                else if(QuestionNo == 11){
			return "She won the award for playing the lead role in Woody Allen's 2013 film-'Blue Jasmine'.";
		}
                else if(QuestionNo == 12){
			return "It is an Italian film and was directed by Paolo Sorrentino.";
		}
                else if(QuestionNo == 13){
			return "This film was released in 1994.";
		}
                else if(QuestionNo == 14){
			return "He also directed films like Jaws,A.I,Minority Report,Amistad etc.";
		}
                else if(QuestionNo == 15){
			return "This film was released in 2004 and Martin Scorcese directed the film.";
		}
                else if(QuestionNo == 16){
			return "Sean Connery played the lead role in this film.";
		}
                else if(QuestionNo == 17){
			return "This film was released in 1995.";
		}
                else if(QuestionNo == 18){
			return "He also played the male lead role in 2005 film-'Mr. & Mrs. Smith'";
		}
                else if(QuestionNo == 19){
			return "His Latest Film venture was 'The Grand Budapest Hotel'.";
		}
                else if(QuestionNo == 20){
			return "He has never won an Oscar.";
		}
                else if(QuestionNo == 21){
			return "That year Michel Hazanavicius's 'The Artist' won the Academy award for Best Picture.";
		}
                else if(QuestionNo == 22){
			return "Hint: He directed the 1960 film-'Psycho'";
		}
                else if(QuestionNo == 23){
			return "He also directed the 2013 film-'The Wolf of Wall Street'";
		}
                else if(QuestionNo == 24){
			return "He also played the lead role in the 'Indiana Jones'-film series.";
		}
                else if(QuestionNo == 25){
			return "He was the owner of LucasFilm before selling it to Walt Disney in 2012.";
		}
                else if(QuestionNo == 26){
			return "He also directed the 2009 film-'Inglorious Basterds'.";
		}
                else if(QuestionNo == 27){
			return "That Film won 11 Oscars in total.";
		}
                else if(QuestionNo == 28){
			return "This actor have won 4 academy awards.";
		}
                else if(QuestionNo == 29){
			return "This film was based on the life of a famous diarist,writer and World War-II victim.";
		}
                else if(QuestionNo == 30){
			return "This director also directed the 2006 film 'The Namesake'.";
		}
                else if(QuestionNo == 31){
			return "This film was released in 2004 and Martin Scorcese directed the film.";
		}
                else if(QuestionNo == 32){
			return "This film was released in 2011.";
		}
                else if(QuestionNo == 33){
			return "This actor was the actor,director and producer of the Academy Award winning film 'Million Dollar Baby(2004)'.";
		}
                else if(QuestionNo == 34){
			return "This actor played the lead role in the'The Mask'-film series.";
		}
                else if(QuestionNo == 35){
			return "This film have won the Academy award for best picture in 1995.";
		}
                else if(QuestionNo == 36){
			return "He has also directed the 2013 film-'The Grandmaster'.";
		}
                else if(QuestionNo == 37){
			return "It was a silent film.";
		}
                else if(QuestionNo == 38){
			return "This actor also played the lead role in the 'Rambo'-film series.";
		}
                else if(QuestionNo == 39){
			return "This Japanese film was released in 2006.";
		}
                else if(QuestionNo == 40){
			return "She also played the Lead Role in 1954 film-'A Star Is Born'.";
		}
                else if(QuestionNo == 41){
			return "It's a western film.";
		}
                else if(QuestionNo == 42){
			return "Robert Zemeckis directed the film and it was released in 1985.";
		}
                else if(QuestionNo == 43){
			return "He also directed films like Apocalypse Now,The Conversation etc.";
		}
                else if(QuestionNo == 44){
			return "The actor played the lead role in Soffia Coppola's 2003 film-'Lost In Translation'.";
		}
                else if(QuestionNo == 45){
			return "Actor Jack Nicholson portrayed this role.";
		}
                else if(QuestionNo == 46){
			return "Bette Davis played the lead role in this film and quoted that quotation.";
		}
                else if(QuestionNo == 47){
			return "It won the academy for the best picture in 1930.";
		}
                else if(QuestionNo == 48){
			return "This actor's notable films are:Reds,Heaven Can't wait,Bulworth etc.";
		}
                else if(QuestionNo == 49){
			return "Her Notable films are:Gaslight,Notorious,Spellbound etc.";
		}
                else if(QuestionNo == 50){
			return "In the previous year he played the lead role in the famous noir film-'The Maltese Falcon'.";
		}
                else if(QuestionNo == 51){
			return "This director also directed the 2002 biopic 'The Pianist'.";
		}
                else if(QuestionNo == 52){
			return "According to the American Film Institute(AFI),this film is the greatest American film ever made.";
		}
                else if(QuestionNo == 53){
			return "Paul Newman played the lead role in this film.";
		}
                else if(QuestionNo == 54){
			return "Stanley Kubrick directed this film.";
		}
                
		else return "";
        
        }
        
        
        
        }
	

