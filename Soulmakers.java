import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.text.*;
import java.util.*;


class A 
{
    static Scanner hi = new Scanner(System.in);
    String male="";
    String female="";
    String name;
	String soulname = "Vishnu";

	int agenumber;
	int e=0;

	int t =1;
    	int ticket;
    	double x;
    	int z;

	int X;
    	double Amt;
    	int Quantity;
    	double Total = 0;

	String ph; //bank

	int RoyalchickenBiryani          =199;
	int SupremechickenDumBiryani   =1499;
	int NizamiMuttonDumBiryani      =489;
	int EggBiryani                            =349;
	int NizamiChickenDumBiryani              =299;
	int RoyalFieryChickenDumBiryaniBL    =289;
	int SPChickenDumBiryanix2Meat         =629;
	int NizamiFieryChickenDumBiryaniBL    =429;
	int ChickenFieryKebab                     =369;
	int ChickenKalmiKebab                     =419;
  	int SpecialVegDumBiryani      =339;
	int MushroomBiryani             =219;
	int PaneerBiryani               =219;
	int MushroomManchurian          =149;
	int PaneerManchurian            =159;
	int CokePet = 40;
	int Spritepet = 40;
	int Thumsuppet = 50;
	int Pepsipet = 70;
	int FruitMixIceCreams = 80;
//1
	int ButterChickenDeluxeThali                          =408;
	int PalakChickenDeluxeThali                           =388;
	int MasalaEggcurryParathaThali                       =249;
	int ChickenManchurianFriedRiceBowl                   =299;
	int ChickenHakkaNoodlesBowl                           =348;
	int LasooniMethiChickenBhindhiChanaJeeraPulao     =269;
	int ButterChickenAlooGhobiJeeraPulao                =279;
	int ShahiMurghBiryani                                  =368;
	int LasooniMethiChickenThali                          =308;
	int KadhaiChickenThaliMeal                            =298;
	int BanarasiDumAlooThalimeal     =258;
	int PaneerMakhaniThaliMeal        =298;
	int SubzKadhaiMiniMeal            =228;
	int AmritsariCholeMiniMeal        =199;
	int DilliWaleRajmaRiceBowl       =199;
	int PepsiBlack                  =79;
	int MasalaLemonade              =48;
	int MasalaRaita                 =35;
	int WildForestBerries          =89;
	int DryFruitOverloadKulfi    =289;
//2
	int ProsciuttoFunghiSandwich                           =671;
	int PestoChickenSandwich                               =627;
	int ChickenBolongneseLasagne                           =616;
	int ClassicWithRoastedChickenSundriedTomatoes     =451;
	int ChickenHamCalzone                                  =594;
	int PorkCalabrianCalzone                               =649;
	int ChickenSchezwanFriedRice                          =280;
	int EggFriedRice                                       =242;
	int FlamingHotChickenWings                            =219;
	int FlamingHotChickenTenders                          =235;
	int TruffleFries               =299;
	int AnimlStyleFries          = 229;
	int SpinachMushroomSandwich   =528;
	int PestovegSandwich          =528;
	int FriedPaneerMomos          =180;
	int TropicalIceCream             = 145;
	int VeganKalaJamunIceCream     = 145;
 	int AlphonsoMangoIceCream       = 145;
	int PistachioButterIceCream     = 145;
	int CookiesandCreamsIceCream  = 289;
//3
	int Chicken65Pizza = 289;
	int BarbequeChickenPizza = 289;
	int ChickenArrabbiataPasta = 349;
	int ChickenAlfredoPasta = 349;
	int BarbequeChickenWings = 249;
	int SmashLambCheeseBurger = 345;
	int MonsterCheeseBurger = 445;
	int ChickenBurger = 365;
	int BuffBurger = 395;
	int SpiceBurger = 375;
	int TandooriVolcanoCheeseBurger = 229;
	int PotatoKrunchBurger = 59;
	int BarbequePaneerPizza = 249;
	int MargheritaPizza = 229;
	int VeggieParadisePizza = 259;
	int ButterscotchMousseCake = 104;
	int RedvelvetLavaCake = 139;
	int FerreroRocherSundae = 260;
	int CocoWalnutBrownie = 110;
	int BlackForestPastry = 100;
//4
	int OreoShake = 199;
	int WatermelonShake =179;
	int BlackGrapeEpic = 169;
	int ChocoNutellaSmoothie = 199;
	int BrownieNutellaThickShake = 219;
	int BlackcurrentFlakeThickShake = 199;
	int FerreroRocherThickShake = 229;
	int VanillaMillionDelightThickShake = 209;
	int StrawberryFruitsLoversMilkshake = 179;
	int BlueberryLoversThickShake = 199;
	int MosambiJuice = 69;
	int PineappleJuice = 59;
	int WatermelonJuice = 59;
	int BananaJuice = 50;
	int OrangeJuice = 69;
	int BrownieFudgeSundae = 170;
	int ChocoPeanutFudgeSundae = 190;
	int NuttyChocoCaramelSundae = 190;
	int CookieShotSundae = 170;
	int ExpressoBrownieFudgeSundae = 190;
//5

    	int Goa = 4000;
    	int Agra = 9000;
    	int Munnar = 6100;

    	int Singapore = 38000;   
    	int Paris = 150000;
    	int Manali = 9500;

    	int Maldives = 150000;
    	int Venice = 100000;
    	int Kanyakumari = 8000;

    	int XT;
    	double AmtT;
    	double TotalT = 0;
	String tT ="";

		String id = "Centruio";
		String pass = "truth@12DinoT";
		String chph = "1010110101";

    static int c=1;
    static int d=0;
	static String blue="\u001B[36m";
	static String green ="\u001B[32m";
	static String red ="\u001B[31m";
	static String reset = "\u001B[0m";
	static String blink = "\u001B[5m";
	static String bold="\u001B[1m";
	static String black ="\u001B[30m";
	static String yellow = "\u001B[33m";
	String whitebg = "\033[47m";  //WHITEbg

	String bg = "\u001B[104m";//bluebg
	static String purplebg = "\u001B[105m";
	static String cyan = "\033[1;36m";
	static String blueh = "\033[1;93m";//yellowh
	static String purpleh = "\033[1;95m";//purpleh
	static String Bg = "\u001B[105m";//purplebg

	static String h = "\u0003";
	String S1="";

	public static void main(String [] args)
	{	
	String w1 = "					"+h+"     "+h+"  "+h+" "+h+" "+h+" "+h+"  "+h+"        "+h+" "+h+" "+h+" "+h+"  "+h+" "+h+" "+h+" "+h+"  "+h+"     "+h+"  "+h+" "+h+" "+h+" "+h;
	String w2 = "					"+h+"     "+h+"  "+h+"        "+h+"        "+h+"        "+h+"     "+h+"  "+h+" "+h+" "+h+" "+h+"  "+h;
	String w3 = "					"+h+"  "+h+"  "+h+"  "+h+" "+h+" "+h+"    "+h+"        "+h+"        "+h+"     "+h+"  "+h+"  "+h+"  "+h+"  "+h+" "+h+" "+h;
	String w4 = "					"+h+" "+h+" "+h+" "+h+"  "+h+"        "+h+"        "+h+"        "+h+"     "+h+"  "+h+"     "+h+"  "+h;
	String w5 = "					"+h+"     "+h+"  "+h+" "+h+" "+h+" "+h+"  "+h+" "+h+" "+h+" "+h+"  "+h+" "+h+" "+h+" "+h+"  "+h+" "+h+" "+h+" "+h+"  "+h+"     "+h+"  "+h+" "+h+" "+h+" "+h;
	System.out.println(red);
	for(int i = 0;i<w1.length();i++)
	{
		try
		{
			Thread.sleep(64);
			System.out.print(w1.charAt(i));
		}
		catch(Exception e){}	
	}
	System.out.println();
	for(int i = 0;i<w2.length();i++)
	{
		try
		{
			Thread.sleep(64);
			System.out.print(w2.charAt(i));
		}
		catch(Exception e){}	
	}
	System.out.println();
	for(int i = 0;i<w3.length();i++)
	{
		try
		{
			Thread.sleep(64);
			System.out.print(w3.charAt(i));
		}
		catch(Exception e){}	
	}
	System.out.println();
	for(int i = 0;i<w4.length();i++)
	{
		try
		{
			Thread.sleep(64);
			System.out.print(w4.charAt(i));
		}
		catch(Exception e){}	
	}
	System.out.println();
	for(int i = 0;i<w5.length();i++)
	{
		try
		{
			Thread.sleep(64);
			System.out.print(w5.charAt(i));
		}
		catch(Exception e){}	
	}
	System.out.println(reset);
		System.out.print(green+bold+"                                                                  TO"+reset);
			System.out.println();
			System.out.println("    * * * * *     * * * * *     *       *     *             *           *           *        *     *     * * * * *     * * * * *     * * * * * ");
			System.out.println("    *             *       *     *       *     *             * *       * *          * *       *    *      *             *       *     *         ");
			System.out.println("    *             *       *     *       *     *             *   *   *   *         *   *      *  *        *             *       *     *         ");
			System.out.println("    * * * * *     *       *     *       *     *             *     *     *        *     *     * *         * * * *       * * * * *     * * * * * ");
			System.out.println("            *     *       *     *       *     *             *           *       * * * * *    *  *        *             *   *                 * ");
			System.out.println("            *     *       *     *       *     *             *           *      *         *   *    *      *             *     *               * ");
			System.out.println("    * * * * *     * * * * *     * * * * *     * * * * *     *           *     *           *  *      *    * * * * *     *       *     * * * * * ");
			System.out.println("                                                                  "+h);
		A x= new A();
		x.soulmaker();
			System.out.print("Hi Nice to see you here !Please Specify your Gender (Male/Female) :  ");
		x.start();
		
		System.out.println("\n	                       Please choose Options from below \n	                       1.Movie		2.Travel	3.Food");
		x.startmtf();

	}
	void soulmaker()
	{
			System.out.println("\n	                                                 "+green+"Login"+reset+"	  |	"+yellow+"Signup"+reset+"\n");
		System.out.println("State your Selection in words...");
		String soulmaker = hi.next();
		if(soulmaker.equalsIgnoreCase("LOGIN")||soulmaker.equals("1"))
		{
			login();
		}
		else if(soulmaker.equalsIgnoreCase("SIGNUP")||soulmaker.equals("2"))
		{
			signup();
		}
		else
		{
			soulmaker();
		}
	}//cell
	void signup()
	{
			System.out.print("                              Enter a name for your Id(no spaces) : ");
		System.out.print(yellow);
		this.id = hi.next();
		System.out.print(reset);
			System.out.println();
		this.id = id+"@soul";
			System.out.print("	                                       Enter phone number : ");
		phonenumber();
			System.out.println();
		this.chph = ph;
			System.out.print("	                             Enter a password (No spaces) : ");
		System.out.print(yellow);
		this.pass = hi.next();
		System.out.print(reset);
			System.out.println();
		System.out.println("\n	                          User Id : "+blue+id+reset);
		  System.out.print("	                         Password : "+blue+pass+reset+"\n");
		System.out.println("Now Login With these details you just "+yellow+"Signed up"+reset+"\n\n");
		login();
	
	}//signup
	void login()
	{
			System.out.print("	                                            Enter Your Id : ");
		System.out.print(green);
		String username = hi.next();
		System.out.print(reset);
		if(username.equalsIgnoreCase(id))
		{
			System.out.print("	                                           Enter Password : ");
			password();	
		}
		else
		{
			System.out.println("User Not Found\n	                       Press 1-> "+red+"Try again"+reset+"	2-> "+yellow+"Sign up"+reset);
			System.out.print(green);
			int zip = hi.nextInt();
			System.out.print(reset);
			if(zip == 1)
			{
				login();
			}
			else if(zip == 2)
			{
				signup();
			}
			else
			{
				System.out.println("You have chosen Invalid Option Try again");
				login();
			}
			
		}
		
	}//login

	void password()
	{
			System.out.print(green);
			String password = hi.next();
			System.out.print(reset);
			if(password.equals(pass))
			{
				System.out.println("\n"+blue+"	                                "+blink+"Do"+reset+blue+" Enjoy ! "+green+blink+"while"+reset+green+" Finding your soulmate "+reset+"\n");
			}
			else
			{
				System.out.println("You have entered Incorrect Password press 1 to "+red+"Try again"+reset+" 2 to "+green+"reset password"+reset);
				System.out.print(green);
				int zap = hi.nextInt();
				System.out.print(reset);
				if(zap ==1)
				{
			System.out.print("	                                          Eneter Password : ");
					password();
				}
				else if(zap == 2)
				{
					System.out.println("OTP has sent to registered mobile number "+chph);
					otplogin();
					login();
				}
				else
				{
					System.out.println("We confused please Re-Enter");
					password();	
				}
			}
	}//login

	void otplogin()
	{
		int gop=1000+(int)(Math.random()*9000);
					System.out.println("	                           Otp : "+blink+red+"'"+whitebg+black+" "+gop+" "+reset);

		try
		{
			System.out.print("\n	                       Please Enter Otp You have Recieved : ");
			Thread.sleep(964);

		}catch(Exception e){}
		System.out.print(green);
		int digitf = hi.nextInt();
		System.out.print(reset);
		if(digitf == gop)
		{
			System.out.print("\n	                                       Enter New Password : ");
			System.out.print(green);
			this.pass = hi.next();
		System.out.print(reset);
		System.out.println("\n	                          Your Id : "+blue+id+reset);
		  System.out.print("\n	                    Your password : "+blue+pass+reset+"\n");			
		}
		else
		{
			System.out.println("You have Entered Wrong Otp. Please Wait You will Recieve another!");
			try
			{
				Thread.sleep(2300);
			}
			catch(Exception e){}
			otplogin();
		}

	}//login

	
	void startmtf()
	{
		hi.nextLine();
		String Mov = hi.nextLine();
		if(Mov.equalsIgnoreCase("MOVIE")||Mov.equals("1"))
		{
			System.out.println("Movies Now Showing\n");
      		accept();
			System.out.println("\n	                       Please choose Options from below \n	                       1.Movie		2.Travel	3.Food\n	                       4."+red+"Exit"+reset);
			startmtf();

		}//movie

		else if(Mov.equalsIgnoreCase("TRAVEL")||Mov.equals("2"))
		{
			travel();
			System.out.println("\n	                       Please choose Options from below \n	                       1.Movie		2.Travel	3.Food\n	                       4."+red+"Exit"+reset);
			startmtf();
		}//travel

		else if(Mov.equalsIgnoreCase("FOOD")||Mov.equals("3"))
		{
			food();
			System.out.println("\n	                       Please choose Options from below \n	                       1.Movie		2.Travel	3.Food\n	                       4."+red+"Exit"+reset);
			startmtf();

		}//food

		else if(Mov.equalsIgnoreCase("EXIT")||Mov.equals("4"))
		{


System.out.println(blink+red+
            "		                :-=*#%%%%%%#+=:.                                                        "+"\n"+
            "		            :=#%%%%%%%%%%%%%%%%%%%%*-.                      ..::----:..                   "+"\n"+
            "		         :+%%%%%%%%%%%%%%%%%%%%%%%%%%%#=               :=#%%%######%%%#*=:              "+"\n"+
            "		       -#%%%%%%%%%%%%%%%#%%%%%%%%%%%%%%%%+.        .=%%%%%%%%+**+#%%%%%%%#=          "+"\n"+
            "		     :#%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%=     -#%%%%%%%%%%%%%%%%%%%%%%%%%%%%%-        "+"\n"+
            "		    +%%%%%%%%%%%%%%%%%+=--=#%%%%%%%%%%%%%%#: =%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%#-      "+"\n"+
            "		   %%%%%%%%%%%%%%%#-           .:=%%%%%%%%%%#%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%#.    "+"\n"+
            "		  %%%%%%%%%%#%%%#:                  =%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%##%%%%%%%%%-   "+"\n"+
            "		 +%%%%%%%%%%%%%%=                      .:=#%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%=  "+"\n"+
            "		.%%%%%%%%%%%%%%-                          :+#%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%- "+"\n"+
            "		+%%%%%%%%%%%%%=                             .=*%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%% "+"\n"+
            "		#%%%%%%%%%%%%%                               %%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%= "+"\n"+
            "		%%%%%%%%%%%%#                              .=#%%#+=----=+#%%%%#%%%%%%%%%%%%%%%%%%%%%%#"+"\n"+
            "		%%%%%%%%%%%%%#                              +=-.              .:=#%%%%%%%%%%%%%%%%%%%%%%%%"+"\n"+
            "		#%%%%%%%%%%%%*                             +                      .*%%%%%%%%%%%%%%%%%%%%%%"+"\n"+
            "		=%%%%%%%%%%%%*                            -#                        +%%%%%%%%%%%%%%%%%%%%#"+"\n"+
            "		.%%%%%%%%%#++-                           :*                          #%%++++++%%%%%%%%%="+"\n"+
            "		 =%%%%%%%%%##                           =%                           :%%%######*%%%%%%%%%."+"\n"+
            "		  #%%%%%%%%%-                           %+                            :-=+#%%%%%%%%%%%%%= "+"\n"+
            "		  .%%%%%%%%%                            %=                                 .#%%%%%%%%%%*  "+"\n"+
            "		   :%%%%%%%+                            +.                                  .%%%%%%%%%#   "+"\n"+
            "		    .#%%%%*                          :=-.                                    =%%%%%%%#    "+"\n"+
            "		      %%                            .=%*                                     =%%%%%%*     "+"\n"+
            "		       =*                --       :#%%%#.                         .++       .%%%%%%-      "+"\n"+
            "		                        =%%%+:   :%%%%%%:                       .*%%%      :%%%%%+        "+"\n"+
            "		                        .%%%%%%#%%%%%%%=                      -%%%%-     =##%%.         "+"\n"+
            "		                         =%%%%%%%%%%%%%%*                     -%%%%*     %%%*:           "+"\n"+
            "		                          #%%%%%%%%%%%%%%+=---=++            .%%%%%+     +%+.             "+"\n"+
            "		                          :%%%%%%%%%%%%%%%%%%%%%%=           *%%%%-     :                "+"\n"+
            "		                           %%%%%%%%%%%%%%%%%%%%%=           +#####:                     "+"\n"+
            "		                           :%%%%%%%%%%%%%%%%##%%%.           .+**=.                     "+"\n"+
            "		                            #%%%%%%%%%%%%%%%%%%%=             +%%=.                       "+"\n"+
            "		                            -%%%%%%%%%%%%%%%%%%*              .:                          "+"\n"+
            "		                             %%%%%%%%%%%%%%%%%#                                            "+"\n"+
            "		                             +%%%%*%%%%%%%%%%#.                                            "+"\n"+
            "		                             :%%%%%%%%%%%%%%%.                                             "+"\n"+
            "		                              :#%%%%%%%%%%%%=                                              "+"\n"+
            "		                                =%%%%%%%%%%%                                               "+"\n"+
            "		                                 .%%%%%%%%                                               "+"\n"+
            "		                                   =%%%%%%%*                                               "+"\n"+
            "		                                    .#%%%%%#                                               "+"\n"+
            "		                                      *%%%%-                                                "
        +reset); 
			System.out.print("		No Payment Required For Asking a "+blink+green);
					try
					{
						Thread.sleep(2000);
						System.out.print("Doubt!");
					}
					catch(Exception e){}
			System.out.print(reset);
		}//exit

		else
		{
			System.out.println("Please see the list again and Enter");
					try
					{
						Thread.sleep(1928);
					}
					catch(Exception e){}
			startmtf();
			
		}//reenter
	}



    void start()
    {
		System.out.print(purpleh);
            String gender=hi.next();
		System.out.print(reset);
            if(gender.equalsIgnoreCase("Male")||gender.equalsIgnoreCase("M"))
            {
                male = "Male";
			System.out.print("\n	                               Please Give your full name : ");
			hi.nextLine();
			System.out.print(cyan);
        		String name=hi.nextLine();
			System.out.print(reset);
			this.name = name;
			System.out.print("\n	                                    Please enter your age : ");
			System.out.print(red);
			agem(hi.nextInt());
				try
				{
					Thread.sleep(964);
					System.out.print("Please Wait..");
				}
				catch(Exception e){}
				try
				{
					Thread.sleep(964);
					System.out.print(".	");
				}
				catch(Exception e){}
				try
				{
					Thread.sleep(964);
					System.out.print("Found !");
				}
				catch(Exception e){}
			selectf(2);
			System.out.println("\n					"+cyan+name+reset+" and "+yellow+soulname+reset+" are Finalised!");
            }
            else if(gender.equalsIgnoreCase("Female")||gender.equalsIgnoreCase("F"))
            {
                female = "Female";
			System.out.print("\n	                              Please Enter your full name : ");
			
			hi.nextLine();
			System.out.print(blueh);
        		String name=hi.nextLine();
			System.out.print(reset);
        		this.name=name;
		      System.out.print("\n	                                    Please enter your age : ");
			System.out.print(red);
			agef(hi.nextInt());
			try
				{
					Thread.sleep(964);
					System.out.print("Please Wait..");
				}
				catch(Exception e){}
				try
				{
					Thread.sleep(964);
					System.out.print("Found !");
				}
				catch(Exception e){}
			selectm(2);
			System.out.println("\n					"+yellow+name+reset+" and "+cyan+soulname+reset+" are Finalised!");
            }
            else
            {
                e++;
                System.out.println("Only Male or Female are welcomed So, Try again");
			if(e==3)
			{
				System.out.println("SORRY Turn 180° & Go Straight");
			}
			else
			{
				start();
			}
            }
        
    }
	void agem(int a)
	{
		System.out.print(reset);
		if(a>40)
		{
                System.out.println("Please enter valid Age | Try again (<41)");
			agem(hi.nextInt());
		}
		else if(a<20)
		{
			System.out.println("Sorry you cannot proceed bye!");
			System.out.println("Welcome next Introvert !Please Specify your Gender (Male/Female)");
			start();
		}
		else
		{
			agenumber = a;
		}
	}
	void agef(int a)
	{
		System.out.print(reset);
		if(a>36)
		{
                System.out.println("Please enter valid Age | Try again (<37)");
			agef(hi.nextInt());
		}
		else if(a<18)
		{
			System.out.println("Sorry you cannot proceed bye!");
			System.out.println("Welcome next Introvert !Please Specify your Gender (Male/Female)");
			start();
		}
		else
		{
			agenumber = a;
		}
	}

	void selectm(int q)
	{
		int otp=1+(int)(Math.random()*24);

        //int x=hi.nextInt();
	
	c++;
        if(otp==1 && c<=4)
        {
	    System.out.println();
            System.out.println("\nName: Sai Charan");
		this.soulname = "Sai Charan";
		System.out.println();
            System.out.println("Age : 23");
	   	System.out.println();
	    if(c<=3)
	    {
	    	System.out.println("To Proceed enter "+blue+blink+"1"+reset+" else enter "+red+blink+"2"+reset+" to refresh ("+q+" left!)");
	
	    	int x1=hi.nextInt();
			if(x1==2)
			{
				for(int f = 1;f<=3;f++)
				{
					try
					{
						Thread.sleep(964);
						System.out.print(". ");
					}
					catch(Exception e){}
				}
				selectm(q-1);
			}
	     }
		
        }
        else if(otp==2 && c<=4)
        {
	    System.out.println();
            System.out.println("\nName: Vikram Nanda");
		this.soulname = "Vikram Nanda";
	    System.out.println();
            System.out.println("Age :  31");
	    System.out.println();
	    if(c<=3)
	    {
	    	System.out.println("To Proceed enter "+blue+blink+"1"+reset+" else enter "+red+blink+"2"+reset+" to refresh ("+q+" left!)");
	    	int x2=hi.nextInt();
			if(x2==2)
			{
				for(int f = 1;f<=3;f++)
				{
					try
					{
						Thread.sleep(964);
						System.out.print(". ");
					}
					catch(Exception e){}
				}
				selectm(q-1);
			}
	    }
        }
        else if(otp==3 && c<=4)
        {
	    System.out.println();
            System.out.println("\nName: Bruce Wayne");
		this.soulname = "Bruce Wayne";
	    System.out.println();
            System.out.println("Age : 28");
	    System.out.println();
	    if(c<=3)
	    {
	    	System.out.println("To Proceed enter "+blue+blink+"1"+reset+" else enter "+red+blink+"2"+reset+" to refresh ("+q+" left!)");
	    	int x3=hi.nextInt();
			if(x3==2)
			{
				for(int f = 1;f<=3;f++)
				{
					try
					{
						Thread.sleep(964);
						System.out.print(". ");
					}
					catch(Exception e){}
				}
				selectm(q-1);
			}
	    }
        }
        else if(otp==4 && c<=4)
        {
	     System.out.println();
            System.out.println("\nName: Mahi");
		this.soulname = "Mahi";
	    System.out.println();
            System.out.println("Age : 24");
	    System.out.println();
	    if(c<=3)
	    {
	    	System.out.println("To Proceed enter "+blue+blink+"1"+reset+" else enter "+red+blink+"2"+reset+" to refresh ("+q+" left!)");
	    	int x4=hi.nextInt();
			if(x4==2)
			{
				for(int f = 1;f<=3;f++)
				{
					try
					{
						Thread.sleep(964);
						System.out.print(". ");
					}
					catch(Exception e){}
				}
				selectm(q-1);
			}
	    }
        }
        else if(otp==5 && c<=4)
        {
	    System.out.println();
            System.out.println("\nName: Gopikrishna");
		this.soulname = "Gopikrishna";
	    System.out.println();
            System.out.println("Age : 22");
	    System.out.println();
	    if(c<=3)
	    {
	    	System.out.println("To Proceed enter "+blue+blink+"1"+reset+" else enter "+red+blink+"2"+reset+" to refresh ("+q+" left!)");
	    	int x5=hi.nextInt();
			if(x5==2)
			{
				for(int f = 1;f<=3;f++)
				{
					try
					{
						Thread.sleep(964);
						System.out.print(". ");
					}
					catch(Exception e){}
				}
				selectm(q-1);
			}
	     }
        }
        else if(otp==6 && c<=4)
        {
	    System.out.println();
            System.out.println("\nName: Raj Pavan");
		this.soulname = "Raj Pavan";
	    System.out.println();
            System.out.println("Age : 25");
	    System.out.println();
	    if(c<=3)
	    {
	    	System.out.println("To Proceed enter "+blue+blink+"1"+reset+" else enter "+red+blink+"2"+reset+" to refresh ("+q+" left!)");
	    	int x6=hi.nextInt();
			if(x6==2)
			{
				for(int f = 1;f<=3;f++)
				{
					try
					{
						Thread.sleep(964);
						System.out.print(". ");
					}
					catch(Exception e){}
				}
				selectm(q-1);
			}
	    }
        }
        else if(otp==7 && c<=4)
        {
	     System.out.println();
            System.out.println("\nName: Vardhan");
		this.soulname = "Vardhan";
	    System.out.println();
            System.out.println("Age : 27");
	    System.out.println();
	    if(c<=3)
	    {
	    	System.out.println("To Proceed enter "+blue+blink+"1"+reset+" else enter "+red+blink+"2"+reset+" to refresh ("+q+" left!)");
	        int x7=hi.nextInt();
			if(x7==2)
			{
				for(int f = 1;f<=3;f++)
				{
					try
					{
						Thread.sleep(964);
						System.out.print(". ");
					}
					catch(Exception e){}
				}
				selectm(q-1);
			}
	     }
        }
        else if(otp==8 && c<=4)
        {
	    System.out.println();
            System.out.println("\nName: Abhinav");
		this.soulname = "Abhinav";
	    System.out.println();
            System.out.println("Age : 25");
	    System.out.println();
	    if(c<=3)
	    {
	    	System.out.println("To Proceed enter "+blue+blink+"1"+reset+" else enter "+red+blink+"2"+reset+" to refresh ("+q+" left!)");
	    	int x8=hi.nextInt();
			if(x8==2)
			{
				for(int f = 1;f<=3;f++)
				{
					try
					{
						Thread.sleep(964);
						System.out.print(". ");
					}
					catch(Exception e){}
				}
				selectm(q-1);
			}
            }
	}
        else if(otp==9 && c<=4)
        {
	    System.out.println();
            System.out.println("\nName: Komal");
		this.soulname = "Komal";
	    System.out.println();
            System.out.println("Age : 29");
	    System.out.println();
	    if(c<=3)
	    {
	    	System.out.println("To Proceed enter "+blue+blink+"1"+reset+" else enter "+red+blink+"2"+reset+" to refresh ("+q+" left!)");
	    	int x9=hi.nextInt();
			if(x9==2)
			{
				for(int f = 1;f<=3;f++)
				{
					try
					{
						Thread.sleep(964);
						System.out.print(". ");
					}
					catch(Exception e){}
				}
				selectm(q-1);
			}
	     }
        }
        else if(otp==10 && c<=4)
        {
	    System.out.println();
            System.out.println("\nName: Krishna");
		this.soulname = "Krishna";
	    System.out.println();
            System.out.println("Age : 24");
	    System.out.println();
	    if(c<=3)
	    {
	    	System.out.println("To Proceed enter "+blue+blink+"1"+reset+" else enter "+red+blink+"2"+reset+" to refresh ("+q+" left!)");
	    	int x10=hi.nextInt();
			if(x10==2)
			{
				for(int f = 1;f<=3;f++)
				{
					try
					{
						Thread.sleep(964);
						System.out.print(". ");
					}
					catch(Exception e){}
				}
				selectm(q-1);
			}
	     }
        }
        else if(otp==11 && c<=4)
        {
	    System.out.println();
            System.out.println("\nName: Chaitanya");
		this.soulname = "Chaitanya";
	    System.out.println();
            System.out.println("Age : 23");
	    System.out.println();
	    if(c<=3)
	    {
	    	System.out.println("To Proceed enter "+blue+blink+"1"+reset+" else enter "+red+blink+"2"+reset+" to refresh ("+q+" left!)");
	    	int x11=hi.nextInt();
			if(x11==2)
			{
				for(int f = 1;f<=3;f++)
				{
					try
					{
						Thread.sleep(964);
						System.out.print(". ");
					}
					catch(Exception e){}
				}
				selectm(q-1);
			}
	    }
        }
        else if(otp==12 && c<=4)
        {
	    System.out.println();
            System.out.println("\nName: Srujan");
		this.soulname = "Srujan";
	    System.out.println();
            System.out.println("Age : 26");
	    System.out.println();
	    if(c<=3)
	    {
	    	System.out.println("To Proceed enter "+blue+blink+"1"+reset+" else enter "+red+blink+"2"+reset+" to refresh ("+q+" left!)");
	    	int x12=hi.nextInt();
			if(x12==2)
			{
				for(int f = 1;f<=3;f++)
				{
					try
					{
						Thread.sleep(964);
						System.out.print(". ");
					}
					catch(Exception e){}
				}
				selectm(q-1);
			}
	    }
        }
        else if(otp==13 && c<=4)
        {
	    System.out.println();
            System.out.println("\nName: Viraj");
		this.soulname = "Viraj";
	    System.out.println();
            System.out.println("Age : 27");
	    System.out.println();
	    if(c<=3)
	    {
	    	System.out.println("To Proceed enter "+blue+blink+"1"+reset+" else enter "+red+blink+"2"+reset+" to refresh ("+q+" left!)");
	    	int x13=hi.nextInt();
			if(x13==2)
			{
				for(int f = 1;f<=3;f++)
				{
					try
					{
						Thread.sleep(964);
						System.out.print(". ");
					}
					catch(Exception e){}
				}
				selectm(q-1);
			}
	    }
        }
        else if(otp==14 && c<=4)
        {
	    System.out.println();
            System.out.println("\nName: Niklaus");
		this.soulname = "Niklaus";
	    System.out.println();
            System.out.println("Age : 21");
	    System.out.println();
	    if(c<=3)
	    {
	    	System.out.println("To Proceed enter "+blue+blink+"1"+reset+" else enter "+red+blink+"2"+reset+" to refresh ("+q+" left!)");
	    		int x14=hi.nextInt();
			if(x14==2)
			{
				for(int f = 1;f<=3;f++)
				{
					try
					{
						Thread.sleep(964);
						System.out.print(". ");
					}
					catch(Exception e){}
				}
				selectm(q-1);
			}
	    }
        }
        else if(otp==15 && c<=4)
        {
	    System.out.println();
            System.out.println("\nName: Bharath");
		this.soulname = "Bharath";
	    System.out.println();
            System.out.println("Age : 28");
	    System.out.println();
	    if(c<=3)
	    {
	    	System.out.println("To Proceed enter "+blue+blink+"1"+reset+" else enter "+red+blink+"2"+reset+" to refresh ("+q+" left!)");
	    	int x15=hi.nextInt();
		if(x15==2)
		{
				for(int f = 1;f<=3;f++)
				{
					try
					{
						Thread.sleep(964);
						System.out.print(". ");
					}
					catch(Exception e){}
				}
				selectm(q-1);
		}
	    }
        }
        else if(otp==16 && c<=4)
        {
	    System.out.println();
            System.out.println("\nName: Anandh");
		this.soulname = "Anandh";
	    System.out.println();
            System.out.println("Age : 23");
	    System.out.println();
	    if(c<=3)
	    { 
	    	System.out.println("To Proceed enter "+blue+blink+"1"+reset+" else enter "+red+blink+"2"+reset+" to refresh ("+q+" left!)");
	    	int x16=hi.nextInt();
			if(x16==2)
			{
				for(int f = 1;f<=3;f++)
				{
					try
					{
						Thread.sleep(964);
						System.out.print(". ");
					}
					catch(Exception e){}
				}
				selectm(q-1);
			}
	    }
        }
        else if(otp==17 && c<=4)
        {
	    System.out.println();
            System.out.println("\nName: Howard Stark");
		this.soulname = "Howard Stark";
	    System.out.println();
            System.out.println("Age : 26");
	    System.out.println();
	    if(c<=3)
	    {
	    	System.out.println("To Proceed enter "+blue+blink+"1"+reset+" else enter "+red+blink+"2"+reset+" to refresh ("+q+" left!)");
	    	int x17=hi.nextInt();
			if(x17==2)
			{
				for(int f = 1;f<=3;f++)
				{
					try
					{
						Thread.sleep(964);
						System.out.print(". ");
					}
					catch(Exception e){}
				}
				selectm(q-1);
			}
	    }
        }
        else if(otp==18 && c<=4)
        {
	    System.out.println();
            System.out.println("\nName: Kalyan");
		this.soulname = "Kalyan";
	    System.out.println();
            System.out.println("Age : 24");
	    System.out.println();
	    if(c<=3)
	    {
	    	System.out.println("To Proceed enter "+blue+blink+"1"+reset+" else enter "+red+blink+"2"+reset+" to refresh ("+q+" left!)");
	    	int x18=hi.nextInt();
			if(x18==2)
			{
				for(int f = 1;f<=3;f++)
				{
					try
					{
						Thread.sleep(964);
						System.out.print(". ");
					}
					catch(Exception e){}
				}
				selectm(q-1);
			}
	    }
        }
        else if(otp==19 && c<=4)
        {
	    System.out.println();
            System.out.println("\nName: Tanishiq");
		this.soulname = "Tanishiq";
	    System.out.println();
            System.out.println("Age : 29");
	    System.out.println();
	    if(c<=3)
	    {
	    	System.out.println("To Proceed enter "+blue+blink+"1"+reset+" else enter "+red+blink+"2"+reset+" to refresh ("+q+" left!)");
	    	int x19=hi.nextInt();
			if(x19==2)
			{
				for(int f = 1;f<=3;f++)
				{
					try
					{
						Thread.sleep(964);
						System.out.print(". ");
					}
					catch(Exception e){}
				}
				selectm(q-1);
			}
	    }
        }
        else if(otp==20 && c<=4)
        {
            System.out.println("\n\nName: Jeeva\n");
		this.soulname = "Jeeva";
            System.out.println("Age : 29\n");
	    if(c<=3)
	    {
	    	System.out.println("To Proceed enter "+blue+blink+"1"+reset+" else enter "+red+blink+"2"+reset+" to refresh ("+q+" left!)");
	    	int x20=hi.nextInt();
			if(x20==2)
			{
				for(int f = 1;f<=3;f++)
				{
					try
					{
						Thread.sleep(964);
						System.out.print(". ");
					}
					catch(Exception e){}
				}
				selectm(q-1);
			}
	    }
        }
        else if(otp==21 && c<=4)
        {
            System.out.println("\n\nName: Yashwanth\n");
		this.soulname = "Yashwanth";
            System.out.println("Age : 28\n");
	    if(c<=3)
	    {
	    	System.out.println("To Proceed enter "+blue+blink+"1"+reset+" else enter "+red+blink+"2"+reset+" to refresh ("+q+" left!)");
	    	int x21=hi.nextInt();
			if(x21==2)
			{
				for(int f = 1;f<=3;f++)
				{
					try
					{
						Thread.sleep(964);
						System.out.print(". ");
					}
					catch(Exception e){}
				}
				selectm(q-1);
			}
	    }
        }
        else if(otp==22 && c<=4)
        {
            System.out.println("\n\nName: Leonardo\n");
		this.soulname = "Leonardo";
            System.out.println("Age : 25\n");
	    if(c<=3)
	    {
	    	System.out.println("To Proceed enter "+blue+blink+"1"+reset+" else enter "+red+blink+"2"+reset+" to refresh ("+q+" left!)");
	    	int x22=hi.nextInt();
			if(x22==2)
			{
				for(int f = 1;f<=3;f++)
				{
					try
					{
						Thread.sleep(964);
						System.out.print(". ");
					}
					catch(Exception e){}
				}
				selectm(q-1);
			}
	    }
        }
        else if(otp==23 && c<=4)
        {
            System.out.println("\n\nName: Nanda\n");
		this.soulname = "Nanda";
            System.out.println("Age : 24\n");
	    if(c<=3)
	    {
	    	System.out.println("To Proceed enter "+blue+blink+"1"+reset+" else enter "+red+blink+"2"+reset+" to refresh ("+q+" left!)");
	   	int x23=hi.nextInt();
			if(x23==2)
			{
				for(int f = 1;f<=3;f++)
				{
					try
					{
						Thread.sleep(964);
						System.out.print(". ");
					}
					catch(Exception e){}
				}
				selectm(q-1);
			}
	    }
	  
        }
        else if(otp==24 && c<=4)
        {
            System.out.println("\n\nName: Dhanush\n");
		this.soulname = "Dhanush";
            System.out.println("Age : 28\n");
	    if(c<=3)
	    {
	    	System.out.println("To Proceed enter "+blue+blink+"1"+reset+" else enter "+red+blink+"2"+reset+" to refresh ("+q+" left!)");
	    	int x24=hi.nextInt();
			if(x24==2)
			{
				for(int f = 1;f<=3;f++)
				{
					try
					{
						Thread.sleep(964);
						System.out.print(". ");
					}
					catch(Exception e){}
				}
				selectm(q-1);
			}
	    }
        }
        else if(otp==25 && c<=4)
        {
            System.out.println("\n\nName: Badri\n");
		this.soulname = "Badri";
            System.out.println("Age : 26\n");
	    if(c<=3)
	    {
	    	System.out.println("To Proceed enter "+blue+blink+"1"+reset+" else enter "+red+blink+"2"+reset+" to refresh ("+q+" left!)");
	   	int x25=hi.nextInt();
			if(x25==2)
			{
				for(int f = 1;f<=3;f++)
				{
					try
					{
						Thread.sleep(964);
						System.out.print(". ");
					}
					catch(Exception e){}
				}
				selectm(q-1);
			}
	    }
        }
   } //selectm



	void selectf(int q)
    	{
		int otp=1+(int)(Math.random()*24);

        //int x=hi.nextInt();
	
	c++;
        if(otp==1 && c<=4)
        {
            System.out.println("\n\nName: Prameela\n");
		this.soulname = "Prameela";
            System.out.println("\nAge : 23\n");
	    if(c<=3)
	    {
	    	System.out.println("To Proceed enter "+blue+blink+"1"+reset+" else enter "+red+blink+"2"+reset+" to refresh ("+q+" left!)");
	
	    	int x1=hi.nextInt();
			if(x1==2)
			{
				for(int f = 1;f<=3;f++)
				{
					try
					{
						Thread.sleep(964);
						System.out.print(". ");
					}
					catch(Exception e){}
				}
				selectf(q-1);
			}
	     }
		
        }
        else if(otp==2 && c<=4)
        {
	    System.out.println();
            System.out.println("\nName: Rohini");
		this.soulname = "Rohini";
	    System.out.println();
            System.out.println("Age :  25");
	    System.out.println();
	    if(c<=3)
	    {
	    	System.out.println("To Proceed enter "+blue+blink+"1"+reset+" else enter "+red+blink+"2"+reset+" to refresh ("+q+" left!)");
	    	int x2=hi.nextInt();
			if(x2==2)
			{
				for(int f = 1;f<=3;f++)
				{
					try
					{
						Thread.sleep(964);
						System.out.print(". ");
					}
					catch(Exception e){}
				}
				selectf(q-1);
			}
	    }
        }
        else if(otp==3 && c<=4)
        {
	    System.out.println();
            System.out.println("\nName: Sravani");
		this.soulname = "Sravani";
	    System.out.println();
            System.out.println("Age : 22");
	    System.out.println();
	    if(c<=3)
	    {
	    	System.out.println("To Proceed enter "+blue+blink+"1"+reset+" else enter "+red+blink+"2"+reset+" to refresh ("+q+" left!)");
	    	int x3=hi.nextInt();
			if(x3==2)
			{
				for(int f = 1;f<=3;f++)
				{
					try
					{
						Thread.sleep(964);
						System.out.print(". ");
					}
					catch(Exception e){}
				}
				selectf(q-1);
			}
	    }
        }
        else if(otp==4 && c<=4)
        {
	     System.out.println();
            System.out.println("\nName: Sunny");
		this.soulname = "Sunny";
	    System.out.println();
            System.out.println("Age : 22");
	    System.out.println();
	    if(c<=3)
	    {
	    	System.out.println("To Proceed enter "+blue+blink+"1"+reset+" else enter "+red+blink+"2"+reset+" to refresh ("+q+" left!)");
	    	int x4=hi.nextInt();
			if(x4==2)
			{
				for(int f = 1;f<=3;f++)
				{
					try
					{
						Thread.sleep(964);
						System.out.print(". ");
					}
					catch(Exception e){}
				}
				selectf(q-1);
			}
	    }
        }
        else if(otp==5 && c<=4)
        {
	    System.out.println();
            System.out.println("\nName: Sireesha");
		this.soulname = "Sireesha";
	    System.out.println();
            System.out.println("Age : 21");
	    System.out.println();
	    if(c<=3)
	    {
	    	System.out.println("To Proceed enter "+blue+blink+"1"+reset+" else enter "+red+blink+"2"+reset+" to refresh ("+q+" left!)");
	    	int x5=hi.nextInt();
			if(x5==2)
			{
				for(int f = 1;f<=3;f++)
				{
					try
					{
						Thread.sleep(964);
						System.out.print(". ");
					}
					catch(Exception e){}
				}
				selectf(q-1);
			}
	     }
        }
        else if(otp==6 && c<=4)
        {
	    System.out.println();
            System.out.println("\nName: Soumika");
		this.soulname = "Soumika";
	    System.out.println();
            System.out.println("Age : 25");
	    System.out.println();
	    if(c<=3)
	    {
	    	System.out.println("To Proceed enter "+blue+blink+"1"+reset+" else enter "+red+blink+"2"+reset+" to refresh ("+q+" left!)");
	    	int x6=hi.nextInt();
			if(x6==2)
			{
				for(int f = 1;f<=3;f++)
				{
					try
					{
						Thread.sleep(964);
						System.out.print(". ");
					}
					catch(Exception e){}
				}
				selectf(q-1);
			}
	    }
        }
        else if(otp==7 && c<=4)
        {
	     System.out.println();
            System.out.println("\nName: Thanuja");
		this.soulname = "Thanuja";
	    System.out.println();
            System.out.println("Age : 25");
	    System.out.println();
	    if(c<=3)
	    {
	    	System.out.println("To Proceed enter "+blue+blink+"1"+reset+" else enter "+red+blink+"2"+reset+" to refresh ("+q+" left!)");
	        int x7=hi.nextInt();
			if(x7==2)
			{
				for(int f = 1;f<=3;f++)
				{
					try
					{
						Thread.sleep(964);
						System.out.print(". ");
					}
					catch(Exception e){}
				}
				selectf(q-1);
			}
	     }
        }
        else if(otp==8 && c<=4)
        {
	    System.out.println();
            System.out.println("\nName: Vireesha");
		this.soulname = "Vireesha";
	    System.out.println();
            System.out.println("Age : 25");
	    System.out.println();
	    if(c<=3)
	    {
	    	System.out.println("To Proceed enter "+blue+blink+"1"+reset+" else enter "+red+blink+"2"+reset+" to refresh ("+q+" left!)");
	    	int x8=hi.nextInt();
			if(x8==2)
			{
				for(int f = 1;f<=3;f++)
				{
					try
					{
						Thread.sleep(964);
						System.out.print(". ");
					}
					catch(Exception e){}
				}
				selectf(q-1);
			}
            }
	}
        else if(otp==9 && c<=4)
        {
	    System.out.println();
            System.out.println("\nName: Krithika");
		this.soulname = "Krithika";
	    System.out.println();
            System.out.println("Age : 24");
	    System.out.println();
	    if(c<=3)
	    {
	    	System.out.println("To Proceed enter "+blue+blink+"1"+reset+" else enter "+red+blink+"2"+reset+" to refresh ("+q+" left!)");
	    	int x9=hi.nextInt();
			if(x9==2)
			{
				for(int f = 1;f<=3;f++)
				{
					try
					{
						Thread.sleep(964);
						System.out.print(". ");
					}
					catch(Exception e){}
				}
				selectf(q-1);
			}
	     }
        }
        else if(otp==10 && c<=4)
        {
	    System.out.println();
            System.out.println("\nName: Ishika");
		this.soulname = "Ishika";
	    System.out.println();
            System.out.println("Age : 24");
	    System.out.println();
	    if(c<=3)
	    {
	    	System.out.println("To Proceed enter "+blue+blink+"1"+reset+" else enter "+red+blink+"2"+reset+" to refresh ("+q+" left!)");
	    	int x10=hi.nextInt();
			if(x10==2)
			{
				for(int f = 1;f<=3;f++)
				{
					try
					{
						Thread.sleep(964);
						System.out.print(". ");
					}
					catch(Exception e){}
				}
				selectf(q-1);
			}
	     }
        }
        else if(otp==11 && c<=4)
        {
	    System.out.println();
            System.out.println("\nName: Chanchala");
		this.soulname = "Chanchala";
	    System.out.println();
            System.out.println("Age : 23");
	    System.out.println();
	    if(c<=3)
	    {
	    	System.out.println("To Proceed enter "+blue+blink+"1"+reset+" else enter "+red+blink+"2"+reset+" to refresh ("+q+" left!)");
	    	int x11=hi.nextInt();
			if(x11==2)
			{
				for(int f = 1;f<=3;f++)
				{
					try
					{
						Thread.sleep(964);
						System.out.print(". ");
					}
					catch(Exception e){}
				}
				selectf(q-1);
			}
	    }
        }
        else if(otp==12 && c<=4)
        {
	    System.out.println();
            System.out.println("\nName: Jhanvi");
		this.soulname = "Jhanvi";
	    System.out.println();
            System.out.println("Age : 20");
	    System.out.println();
	    if(c<=3)
	    {
	    	System.out.println("To Proceed enter "+blue+blink+"1"+reset+" else enter "+red+blink+"2"+reset+" to refresh ("+q+" left!)");
	    	int x12=hi.nextInt();
			if(x12==2)
			{
				for(int f = 1;f<=3;f++)
				{
					try
					{
						Thread.sleep(964);
						System.out.print(". ");
					}
					catch(Exception e){}
				}
				selectf(q-1);
			}
	    }
        }
        else if(otp==13 && c<=4)
        {
	    System.out.println();
            System.out.println("\nName: Haasini");
		this.soulname = "Haasini";
	    System.out.println();
            System.out.println("Age : 24");
	    System.out.println();
	    if(c<=3)
	    {
	    	System.out.println("To Proceed enter "+blue+blink+"1"+reset+" else enter "+red+blink+"2"+reset+" to refresh ("+q+" left!)");
	    	int x13=hi.nextInt();
			if(x13==2)
			{
				for(int f = 1;f<=3;f++)
				{
					try
					{
						Thread.sleep(964);
						System.out.print(". ");
					}
					catch(Exception e){}
				}
				selectf(q-1);
			}
	    }
        }
        else if(otp==14 && c<=4)
        {
	    System.out.println();
            System.out.println("\nName: Isha");
		this.soulname = "Isha";
	    System.out.println();
            System.out.println("Age : 21");
	    System.out.println();
	    if(c<=3)
	    {
	    	System.out.println("To Proceed enter "+blue+blink+"1"+reset+" else enter "+red+blink+"2"+reset+" to refresh ("+q+" left!)");
	    		int x14=hi.nextInt();
			if(x14==2)
			{
				for(int f = 1;f<=3;f++)
				{
					try
					{
						Thread.sleep(964);
						System.out.print(". ");
					}
					catch(Exception e){}
				}
				selectf(q-1);
			}
	    }
        }
        else if(otp==15 && c<=4)
        {
	    System.out.println();
            System.out.println("\nName: Bhanumathi");
		this.soulname = "Bhanumathi";
	    System.out.println();
            System.out.println("Age : 23");
	    System.out.println();
	    if(c<=3)
	    {
	    	System.out.println("To Proceed enter "+blue+blink+"1"+reset+" else enter "+red+blink+"2"+reset+" to refresh ("+q+" left!)");
	    	int x15=hi.nextInt();
		if(x15==2)
		{
				for(int f = 1;f<=3;f++)
				{
					try
					{
						Thread.sleep(964);
						System.out.print(". ");
					}
					catch(Exception e){}
				}
				selectf(q-1);
		}
	    }
        }
        else if(otp==16 && c<=4)
        {
	    System.out.println();
            System.out.println("\nName: Darshana");
		this.soulname = "Darshana";
	    System.out.println();
            System.out.println("Age : 20");
	    System.out.println();
	    if(c<=3)
	    { 
	    	System.out.println("To Proceed enter "+blue+blink+"1"+reset+" else enter "+red+blink+"2"+reset+" to refresh ("+q+" left!)");
	    	int x16=hi.nextInt();
			if(x16==2)
			{
				for(int f = 1;f<=3;f++)
				{
					try
					{
						Thread.sleep(964);
						System.out.print(". ");
					}
					catch(Exception e){}
				}
				selectf(q-1);
			}
	    }
        }
        else if(otp==17 && c<=4)
        {
	    System.out.println();
            System.out.println("\nName: Aditi");
		this.soulname = "Aditi";
	    System.out.println();
            System.out.println("Age : 21");
	    System.out.println();
	    if(c<=3)
	    {
	    	System.out.println("To Proceed enter "+blue+blink+"1"+reset+" else enter "+red+blink+"2"+reset+" to refresh ("+q+" left!)");
	    	int x17=hi.nextInt();
			if(x17==2)
			{
				for(int f = 1;f<=3;f++)
				{
					try
					{
						Thread.sleep(964);
						System.out.print(". ");
					}
					catch(Exception e){}
				}
				selectf(q-1);
			}
	    }
        }
        else if(otp==18 && c<=4)
        {
	    System.out.println();
            System.out.println("\nName: Sandhya Roy");
		this.soulname = "Sandhya Roy";
	    System.out.println();
            System.out.println("Age : 24");
	    System.out.println();
	    if(c<=3)
	    {
	    	System.out.println("To Proceed enter "+blue+blink+"1"+reset+" else enter "+red+blink+"2"+reset+" to refresh ("+q+" left!)");
	    	int x18=hi.nextInt();
			if(x18==2)
			{
				for(int f = 1;f<=3;f++)
				{
					try
					{
						Thread.sleep(964);
						System.out.print(". ");
					}
					catch(Exception e){}
				}
				selectf(q-1);
			}
	    }
        }
        else if(otp==19 && c<=4)
        {
	    System.out.println();
            System.out.println("\nName: Jennie");
		this.soulname = "Jennie";
	    System.out.println();
            System.out.println("Age : 24");
	    System.out.println();
	    if(c<=3)
	    {
	    	System.out.println("To Proceed enter "+blue+blink+"1"+reset+" else enter "+red+blink+"2"+reset+" to refresh ("+q+" left!)");
	    	int x19=hi.nextInt();
			if(x19==2)
			{
				for(int f = 1;f<=3;f++)
				{
					try
					{
						Thread.sleep(964);
						System.out.print(". ");
					}
					catch(Exception e){}
				}
				selectf(q-1);
			}
	    }
        }
        else if(otp==20 && c<=4)
        {
	    System.out.println();
            System.out.println("\nName: Meghna ");
		this.soulname = "Meghna";
	    System.out.println();
            System.out.println("Age : 22");
	    System.out.println();
	    if(c<=3)
	    {
	    	System.out.println("To Proceed enter "+blue+blink+"1"+reset+" else enter "+red+blink+"2"+reset+" to refresh ("+q+" left!)");
	    	int x20=hi.nextInt();
			if(x20==2)
			{
				for(int f = 1;f<=3;f++)
				{
					try
					{
						Thread.sleep(964);
						System.out.print(". ");
					}
					catch(Exception e){}
				}
				selectf(q-1);
			}
	    }
        }
        else if(otp==21 && c<=4)
        {
	    System.out.println();
            System.out.println("\nName: Pratyusha");
		this.soulname = "Pratyusha";
	    System.out.println();
            System.out.println("Age : 22");
	    System.out.println();
	    if(c<=3)
	    {
	    	System.out.println("To Proceed enter "+blue+blink+"1"+reset+" else enter "+red+blink+"2"+reset+" to refresh ("+q+" left!)");
	    	int x21=hi.nextInt();
			if(x21==2)
			{
				for(int f = 1;f<=3;f++)
				{
					try
					{
						Thread.sleep(964);
						System.out.print(". ");
					}
					catch(Exception e){}
				}
				selectf(q-1);
			}
	    }
        }
        else if(otp==22 && c<=4)
        {
	     System.out.println();
            System.out.println("\nName: Sahithi");
		this.soulname = "Sahithi";
	    System.out.println();
            System.out.println("Age : 23");
	    System.out.println();
	    if(c<=3)
	    {
	    	System.out.println("To Proceed enter "+blue+blink+"1"+reset+" else enter "+red+blink+"2"+reset+" to refresh ("+q+" left!)");
	    	int x22=hi.nextInt();
			if(x22==2)
			{
				for(int f = 1;f<=3;f++)
				{
					try
					{
						Thread.sleep(964);
						System.out.print(". ");
					}
					catch(Exception e){}
				}
				selectf(q-1);
			}
	    }
        }
        else if(otp==23 && c<=4)
        {
	    System.out.println();
            System.out.println("\nName: Natasha");
		this.soulname = "Natasha";
	    System.out.println();
            System.out.println("Age : 24");
	    System.out.println();
	    if(c<=3)
	    {
	    	System.out.println("To Proceed enter "+blue+blink+"1"+reset+" else enter "+red+blink+"2"+reset+" to refresh ("+q+" left!)");
	   	int x23=hi.nextInt();
			if(x23==2)
			{
				for(int f = 1;f<=3;f++)
				{
					try
					{
						Thread.sleep(964);
						System.out.print(". ");
					}
					catch(Exception e){}
				}
				selectf(q-1);
			}
	    }
	  
        }
        else if(otp==24 && c<=4)
        {
	    System.out.println();
            System.out.println("\nName: Joshna");
		this.soulname = "Joshna";
	    System.out.println();
            System.out.println("Age : 23");
	    System.out.println();
	    if(c<=3)
	    {
	    	System.out.println("To Proceed enter "+blue+blink+"1"+reset+" else enter "+red+blink+"2"+reset+" to refresh ("+q+" left!)");
	    	int x24=hi.nextInt();
			if(x24==2)
			{
				for(int f = 1;f<=3;f++)
				{
					try
					{
						Thread.sleep(964);
						System.out.print(". ");
					}
					catch(Exception e){}
				}
				selectf(q-1);
			}
	    }
        }
        else if(otp==25 && c<=4)
        {
	    System.out.println();
            System.out.println("\nName: Rishitha");
		this.soulname = "Rishitha";
	    System.out.println();
            System.out.println("Age : 21");
	    System.out.println();
	    if(c<=3)
	    {
	    	System.out.println("To Proceed enter "+blue+blink+"1"+reset+" else enter "+red+blink+"2"+reset+" to refresh ("+q+" left!)");
	   	int x25=hi.nextInt();
			if(x25==2)
			{
				for(int f = 1;f<=3;f++)
				{
					try
					{
						Thread.sleep(964);
						System.out.print(". ");
					}
					catch(Exception e){}
				}
				selectf(q-1);
			}
	    }
        }
   }//selectf


	void m1(int t)
{
	if(t<1||t>10)
	{
		System.out.println("Sorry no MOVIE available for the number you have entered"+green+" Enter again "+reset);
		m1(hi.nextInt());
	}	
	else
	{
		if(t==1)
		{
			this.t=t;
			S1 = "Barbie";
		}
		if(t==2)
		{
			this.t=t;
			S1 = "Mission Impossible (Dead Reckoning Part One)";
		}
		if(t==3)
		{
			this.t=t;
			S1 = "Blue beetle";
		}
		if(t==4)
		{
			this.t=t;
			S1 = "Oppenheimer";
		}
		if(t==5)
		{
			this.t=t;
			S1 = "Meg 2: The Trench";
		}
		if(t==6)
		{
			this.t=t;
			S1 = "Bro";
		}
		if(t==7)
		{
			this.t=t;
			S1 = "JAILER";
		}
		if(t==8)
		{
			this.t=t;
			S1 = "Baby";
		}
		if(t==9)
		{
			this.t=t;
			S1 = "Kushi\n\n	                       Release date: 1st September 2023";
		}
		if(t==10)
		{
			this.t=t;
			S1 = ""+blink+"S A L A A "+red+"R"+reset+"\n\n	                       PA"+red+"R"+reset+"T 1 ceasefi"+red+"R"+reset+"e\n	                       "+red+"R"+reset+"elease date : 28th Septembe"+red+"R"+reset+" 2023\n";
		}
		
	}
	
}
void m2(int z)
{
	if(z!=12 && z!=3 && z!=6 && z!=10)
	{
		System.out.println("Entered wrong timings"+green+" Enter again "+reset);
		m2(hi.nextInt());
	}
	else
	{
		this.z = z;
	}
}
void m3(int ticket)
{
    	if(ticket>2)
	{
		System.out.println(red+"Only 2 tickets allowed Since you are 2 in number "+reset+green+" Eneter again "+reset);
		m3(hi.nextInt());
	}
	else if(ticket<1)
	{
		System.out.println("It seems you don't want to watch movie Thank you have a "+blue+"Good Day"+reset);
	}
	else
	{
		Date d=new Date();
		SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy");
		SimpleDateFormat tih=new SimpleDateFormat("hh");
		SimpleDateFormat tim=new SimpleDateFormat("mm");
		SimpleDateFormat tis=new SimpleDateFormat("ss");
		String dt=sdf.format(d);
		String timeh = tih.format(d);
		String timem = tim.format(d);
		String times = tis.format(d);	
			int tic=1+(int)(Math.random()*24);

	System.out.println("	                       Hang On While Tickets Are Loading...");
		String a1 = "	                       -   -  - - -  -   -  - - -  - - -";
		String a2 = "	                       - - -  -   -   - -     -    - -"; 
		String a3 = "	                       -   -  - - -    -    - - -  - - -";


	for(int i = 0;i<a1.length();i++)
	{
		System.out.print(red);
		try
		{
			System.out.print(a1.charAt(i));
			Thread.sleep(27);
		}
		catch(Exception e){}
	}
	System.out.println(reset);
	for(int i = 0;i<a2.length();i++)
	{
		System.out.print(red);
		try
		{
			System.out.print(a2.charAt(i));
			Thread.sleep(27);
		}
		catch(Exception e){}
	}
	System.out.println(reset);
	for(int i = 0;i<a3.length();i++)
	{
		System.out.print(red);
		try
		{
			System.out.print(a3.charAt(i));
			Thread.sleep(27);
		}
		catch(Exception e){}
	}
	System.out.println(reset);
		System.out.println("Your Ticket");
    	System.out.println("	                       	      "+bg+bold+" Java Cinemas "+reset+"\n\n	                       Movie : "+bold+S1+reset+"\n\n	                       Ticket count:"+red+ticket+reset+"		Timings :"+green+z+reset+":00 PM\n\n	                       Screen : "+blink+t+reset+"		Booking Id : "+"JC"+t+S1.length()+S1.charAt(2)+S1.charAt(S1.length()-3)+tic);
	System.out.println("\n	                           Booked on "+dt+" at "+blue+timeh+reset+blink+":"+reset+green+timem+reset+blink+":"+reset+blueh+times+reset);
		x=150*ticket;
	System.out.println("\n	                       		         "+blink+red+h+reset);

	}
}


  public void accept()
  {
    	System.out.println("	                       	          "+bg+bold+" Java Cinemas "+reset);
	System.out.print("\n");
    	System.out.println("	             1 "+"Barbie                                      "+"	"+""+green+"12:00PM		3:00PM		6:00PM		10:00PM"+reset);
	System.out.print("\n");
	System.out.println("	             2 "+"Mission Impossible (Dead Reckoning Part One)"+"	"+""+green+"12:00PM		3:00PM		6:00PM		10:00PM"+reset);
	System.out.print("\n");
	System.out.println("	             3 Blue beetle                             "+"	"+"	"+green+"12:00PM		3:00PM		6:00PM		10:00PM"+reset);
	System.out.print("\n");
	System.out.println("	             4 Oppenheimer                             "+"	"+"	"+green+"12:00PM		3:00PM		6:00PM		10:00PM"+reset);
	System.out.print("\n");
	System.out.println("	             5 Meg 2: The Trench                       "+"	"+"	"+green+"12:00PM		3:00PM		6:00PM		10:00PM"+reset);
	System.out.print("\n");
	System.out.println("	             6 Bro                                     "+"	"+"	"+green+"12:00PM		3:00PM		6:00PM		10:00PM"+reset);
	System.out.print("\n");
	System.out.println("	             7 "+blink+"JAILER"+reset+"                                  "+"	"+"	"+green+"12:00PM		3:00PM		6:00PM		10:00PM"+reset);
	System.out.print("\n");
	System.out.println("	             8 Baby                                    "+"	"+"	"+green+"12:00PM		3:00PM		6:00PM		10:00PM"+reset);
	System.out.print("\n");
	System.out.println("	             9 Kushi                                   "+"	"+"	"+green+"12:00PM		3:00PM		6:00PM		10:00PM"+reset);
	System.out.print("\n");
	System.out.println("	             10 "+blink+red+"SALAAR"+reset+"	                             "+"	"+"	"+green+"12:00PM		3:00PM		6:00PM		10:00PM"+reset);
	System.out.print("\n");

	System.out.print("\n	                  Enter movie number  :  ");
	m1(hi.nextInt());

    	System.out.print("	               Choose the Movie time  :  ");
    	m2(hi.nextInt());
	
	
    	System.out.print("	             Enter number of tickets  :  ");
	m3(hi.nextInt());
	

  }//acceptmovie


	void food()
	{
		System.out.println("\n	                       	             "+purplebg+"WELCOME TO TUMMYFILLER"+reset+"         ");
		System.out.println("\n                                           Choose Restaurant from below\n");
		displaymenuf();
		System.out.println("	                       *******************************************");
        		System.out.println("	                            Amount to Pay   : " +blink+Total+reset);
        		System.out.println("	                       *******************************************");
			
		bank2();		

	} //food

		void bank2()
		{
			System.out.print("	                       "+whitebg+blue+" Paytm "+reset+"	"+whitebg+purpleh+bold+" Phonepe "+reset+"	"+whitebg+blue+"G"+green+"oo"+yellow+"gle"+red+"pay"+reset+"	"+whitebg+black+bold+" Cash "+reset+"\n	                       ");
			String payment = hi.next();
			if(payment.equalsIgnoreCase("PAYTM")||payment.equals("1"))
			{
				System.out.println("                       Thanks For Choosing Paytm");
				paytm();
			}
			else if(payment.equalsIgnoreCase("PHONEPE")||payment.equals("2"))
			{
				System.out.println("                       Thanks For Choosing PhonePe");
				phonepe();
			}
			else if(payment.equalsIgnoreCase("GOOGLEPAY")||payment.equals("3"))
			{
				System.out.println("                       Thanks For Choosing Google pay");
				googlepay();
			}
			else if(payment.equalsIgnoreCase("CASH")||payment.equals("4"))
			{
				System.out.println("	                       *******************************************");
        				System.out.println("	                            Amount to Pay   : " +blink+Total+reset);
        				System.out.println("	                       *******************************************");
        				System.out.print("	                      Plz Enter The Amount  : ");
				System.out.print(green);
        				double a = hi.nextDouble();
				System.out.println(reset);
				billf(a);
			}
			else
			{
				System.out.println("                       Please select Payment methods from these Only!");
				bank2();
			}

		}//bank2
	
	void displaymenuf()
	{
		System.out.println("	                       1.Best 'n' Biryani	           2.South Thali's\n\n	                       3.Fried 'n' Freeze	           4.Break Passers\n\n	                       5.House of Fluids");
		int hotel = hi.nextInt();
		if(hotel ==1)
		{
			Total = 0;
			displaymenu1();
			System.out.print("\n	                       Enter Your Choice....\n\n	                       num-");
			orderf1();
		}
		else if(hotel == 2)
		{
			Total = 0;
			displaymenu2();
			System.out.print("\n	                       Enter Your Choice....\n\n	                       num-");
			orderf2();
		}
		else if(hotel == 3)
		{
			Total = 0;
			displaymenu3();
			System.out.print("\n	                       Enter Your Choice....\n\n	                       num-");
			orderf3();
		}
		else if(hotel == 4)
		{
			Total = 0;
			displaymenu4();
			System.out.print("\n	                       Enter Your Choice....\n\n	                       num-");
			orderf4();
		}

		else if(hotel == 5)
		{
			Total = 0;
			displaymenu5();
			System.out.print("\n	                       Enter Your Choice....\n\n	                       num-");
			orderf5();
		}
		else
		{
			System.out.println("Only these restaurants are available right now!");
			displaymenuf();
		}
		
	}

	void displaymenu5()
	{
			System.out.println(green+"WELCOME TO"+reset);
		String fd1 = ("		-   -  - - -  -   -  - - -  - - -      - - -  - - -      - - -  -      -   -  - - -  - - -  - - -");
		String fd2 = ("		-   -  -   -  -   -  -      -          -   -  -          -      -      -   -    -    -   -  - ");
		String fd3 = ("		- - -  -   -  -   -  - - -  - -        -   -  - -        - -    -      -   -    -    -   -  - - -");
		String fd4 = ("		-   -  -   -  -   -      -  -          -   -  -          -      -      -   -    -    -   -      -");
		String fd5 = ("		-   -  - - -  - - -  - - -  - - -      - - -  -          -      - - -  - - -  - - -  - - -  - - -");
		 	System.out.print(bold);
			for(int i = 0;i<fd1.length();i++)
			{
				System.out.print(yellow);
				try
				{
					System.out.print(fd1.charAt(i));
					Thread.sleep(27);
				}
				catch(Exception e){}
			}
			System.out.println(reset);
			for(int i = 0;i<fd2.length();i++)
			{
				System.out.print(yellow);
				try
				{
					System.out.print(fd2.charAt(i));
					Thread.sleep(27);
				}
				catch(Exception e){}
			}
			System.out.println(reset);
			for(int i = 0;i<fd3.length();i++)
			{
				System.out.print(yellow);
				try
				{
					System.out.print(fd3.charAt(i));
					Thread.sleep(27);
				}
				catch(Exception e){}
			}
			System.out.println(reset);
			for(int i = 0;i<fd4.length();i++)
			{
				System.out.print(yellow);
				try
				{
					System.out.print(fd4.charAt(i));
					Thread.sleep(27);
				}
				catch(Exception e){}
			}
			System.out.println(reset);
			for(int i = 0;i<fd5.length();i++)
			{
				try
				{
					System.out.print(fd5.charAt(i));
					Thread.sleep(27);
				}
				catch(Exception e){}
			}
			System.out.println(reset);
			
	try
	{
		Thread.sleep(964);
	}
	catch(Exception e){}

        System.out.println("	                       ========================================================");
        System.out.println("	                       	**"+red+"Shakes"+reset+"**   ");
        System.out.println();
        System.out.println("	                           1. Oreo Shake                              199/-");
        System.out.println("	                           2. Watermelon Shake                        179/-");
        System.out.println("	                           3. Black Grape Epic                        169/-");
        System.out.println("	                           4. Choco Nutella Smoothie                  199/-");
        System.out.println("	                           5. Brownie Nutella Thick Shake             219/-");
        System.out.println("	                           6. Blackcurrent Flake Thick Shake          199/-");
        System.out.println("	                           7. Ferrero Rocher Thick Shake              229/-");
        System.out.println("	                           8. Vanilla Million Delight Thick Shake     209/-");
        System.out.println("	                           9. Strawberry Fruits Lovers Milkshake      179/-");
        System.out.println("	                          10. Blueberry Lovers Thick Shake            199/-");
        System.out.println();
	try
	{
		Thread.sleep(964);
	}
	catch(Exception e){}

        System.out.println("	                       	**"+green+"JUICES"+reset+"**");
        System.out.println();
        System.out.println("	                          11. Mosambi Juice      69/-  ");
        System.out.println("	                          12. Pineapple Juice    59/-  ");
        System.out.println("	                          13. Watermelon Juice   59/-  ");
        System.out.println("	                          14. Banana Juice       50/-  ");
        System.out.println("	                          15. Orange Juice       69/-  ");
        System.out.println();
	try
	{
		Thread.sleep(2892);
	}
	catch(Exception e){}

        System.out.println("	                       	**"+cyan+"Sundae"+reset+"**");
        System.out.println();
        System.out.println("	                          16. Brownie Fudge Sundae              170/-  ");
        System.out.println("	                          17. Choco Peanut Fudge Sundae         190/-  ");
        System.out.println("	                          18. Nutty Choco Caramel Sundae        190/-  ");
        System.out.println("	                          19. Cookie Shot Sundae                170/-  ");
        System.out.println("	                          20. Expresso Brownie Fudge Sundae     190/-  ");
	try
	{
		Thread.sleep(964);
	}
	catch(Exception e){}

        System.out.println("	                          21. "+red+"Exit"+reset+"          ");
        System.out.println("	                       ========================================================");
        System.out.println("                       Hello couples!!!!...What Do You Want to Order ..??");

	}//Fluids

	void displaymenu4()
	{
			System.out.println(green+"WELCOME TO"+reset);
		
		String fd1 = ("		- - -  - - -  - - -      -      -   -     - - -      -      - - -  - - -  - - -  - - -  - - -");
		String fd2 = ("		-   -  -   -  -         - -     -  -      -   -     - -     -      -      -      -   -  -");
		String fd3 = ("		- - -  - - -  - -      - - -    - -       - - -    - - -    - - -  - - -  - -    - - -  - - -");
		String fd4 = ("		-   -  - -    -       -     -   -  -      -       -     -       -      -  -      - -        -");
		String fd5 = ("		- - -  -   -  - - -  -       -  -   -     -      -       -  - - -  - - -  - - -  -   -  - - -");
			 System.out.print(bold);
			for(int i = 0;i<fd1.length();i++)
			{
				System.out.print(yellow);
				try
				{
					System.out.print(fd1.charAt(i));
					Thread.sleep(27);
				}
				catch(Exception e){}
			}
			System.out.println(reset);
			for(int i = 0;i<fd2.length();i++)
			{
				System.out.print(yellow);
				try
				{
					System.out.print(fd2.charAt(i));
					Thread.sleep(27);
				}
				catch(Exception e){}
			}
			System.out.println(reset);
			for(int i = 0;i<fd3.length();i++)
			{
				System.out.print(yellow);
				try
				{
					System.out.print(fd3.charAt(i));
					Thread.sleep(27);
				}
				catch(Exception e){}
			}
			System.out.println(reset);
			for(int i = 0;i<fd4.length();i++)
			{
				System.out.print(yellow);
				try
				{
					System.out.print(fd4.charAt(i));
					Thread.sleep(27);
				}
				catch(Exception e){}
			}
			System.out.println(reset);
			for(int i = 0;i<fd5.length();i++)
			{
				System.out.print(yellow);
				try
				{
					System.out.print(fd5.charAt(i));
					Thread.sleep(27);
				}
				catch(Exception e){}
			}
			System.out.println(reset);
	try
	{
		Thread.sleep(964);
	}
	catch(Exception e){}

        System.out.println("	                       ===================================================");
        System.out.println("	                       	**"+red+"NON-VEG ITEMS"+reset+"**   ");
        System.out.println();
        System.out.println("	                           1. Chicken 65 Pizza             289/-");
        System.out.println("	                           2. Barbeque Chicken Pizza       289/-");
        System.out.println("	                           3. Chicken Arrabbiata Pasta     349/-");
        System.out.println("	                           4. Chicken Alfredo Pasta        349/-");
        System.out.println("	                           5. Barbeque Chicken Wings       249/-");
        System.out.println("	                           6. Smash Lamb Cheese Burger     345/-");
        System.out.println("	                           7. Monster Cheese Burger        445/-");
        System.out.println("	                           8. Chicken Burger               365/-");
        System.out.println("	                           9. Buff Burger                  395/-");
        System.out.println("	                          10. Spice Burger                 375/-");
        System.out.println();
	try
	{
		Thread.sleep(964);
	}
	catch(Exception e){}

        System.out.println("	                       	**"+green+"VEG ITEMS"+reset+"**");
        System.out.println();
        System.out.println("	                          11. Tandoori Volcano Cheese Burger   229/-  ");
        System.out.println("	                          12. Potato Krunch Burger              59/-  ");
        System.out.println("	                          13. Barbeque Paneer Pizza            249/-  ");
        System.out.println("	                          14. Margherita Pizza                 229/-  ");
        System.out.println("	                          15. Veggie Paradise Pizza            259/-  ");
        System.out.println();
	try
	{
		Thread.sleep(2892);
	}
	catch(Exception e){}

        System.out.println("	                       	**"+cyan+"Desserts"+reset+"**");
        System.out.println();
        System.out.println("	                          16. Butterscotch Mousse Cake   104/-  ");
        System.out.println("	                          17. Red velvet Lava Cake       139/-  ");
        System.out.println("	                          18. Ferrero Rocher Sundae      260/-  ");
        System.out.println("	                          19. Coco Walnut Brownie        110/-  ");
        System.out.println("	                          20. Black Forest Pastry        100/-  ");
	try
	{
		Thread.sleep(964);
	}
	catch(Exception e){}

        System.out.println("	                          21. "+red+"Exit"+reset+"          ");
        System.out.println("	                       ===================================================");
        System.out.println("                       Hello couples!!!!...What Do You Want to Order ..??");

	}//BreakPassers


	void displaymenu3()
	{
			System.out.println(green+"WELCOME TO"+reset);

		String fd1 = ("		- - -  - - -  - - -  - - -  - - -    ' -     - '    - - -  - - -  - - -  - - -  - - -  - - -");
		String fd2 = ("		-      -   -    -    -      -   -      - -   -      -      -   -  -      -         -   -");
		String fd3 = ("		- -    - - -    -    - - -  -   -      -  -  -      - -    - - -  - -    - -      -    - -");
		String fd4 = ("		-      - -      -    -      -   -      -   - -      -      - -    -      -       -     -");
		String fd5 = ("		-      -   -  - - -  - - -  - - -      -     -      -      -   -  - - -  - - -  - - -  - - -");
			 System.out.print(bold);
			for(int i = 0;i<fd1.length();i++)
			{
				System.out.print(yellow);
				try
				{
					System.out.print(fd1.charAt(i));
					Thread.sleep(27);
				}
				catch(Exception e){}
			}
			System.out.println(reset);
			for(int i = 0;i<fd2.length();i++)
			{
				System.out.print(yellow);
				try
				{
					System.out.print(fd2.charAt(i));
					Thread.sleep(27);
				}
				catch(Exception e){}
			}
			System.out.println(reset);
			for(int i = 0;i<fd3.length();i++)
			{
				System.out.print(yellow);
				try
				{
					System.out.print(fd3.charAt(i));
					Thread.sleep(27);
				}
				catch(Exception e){}
			}
			System.out.println(reset);
			for(int i = 0;i<fd4.length();i++)
			{
				System.out.print(yellow);
				try
				{
					System.out.print(fd4.charAt(i));
					Thread.sleep(27);
				}
				catch(Exception e){}
			}
			System.out.println(reset);
			for(int i = 0;i<fd5.length();i++)
			{
				System.out.print(yellow);
				try
				{
					System.out.print(fd5.charAt(i));
					Thread.sleep(27);
				}
				catch(Exception e){}
			}
			System.out.println(reset);
	try
	{
		Thread.sleep(964);
	}
	catch(Exception e){}

        System.out.println("	                       ===================================================================");
        System.out.println("	                       	**"+red+"NON-VEG ITEMS"+reset+"**   ");
        System.out.println();
        System.out.println("	                           1. Prosciutto Funghi Sandwich                           671/-");
        System.out.println("	                           2. Pesto Chicken Sandwich                               627/-");
        System.out.println("	                           3. Chicken Bolongnese Lasagne                           616/-");
        System.out.println("	                           4. Classic With Roasted Chicken & Sundried Tomatoes     451/-");
        System.out.println("	                           5. Chicken Ham Calzone                                  594/-");
        System.out.println("	                           6. Pork Calabrian Calzone                               649/-");
        System.out.println("	                           7. Chicken Schezwan Fried Rice                          280/-");
        System.out.println("	                           8. Egg Fried Rice                                       242/-");
        System.out.println("	                           9. Flaming Hot Chicken Wings                            219/-");
        System.out.println("	                          10. Flaming Hot Chicken Tenders                          235/-");
        System.out.println();
	try
	{
		Thread.sleep(964);
	}
	catch(Exception e){}

        System.out.println("	                       	**"+green+"VEG ITEMS"+reset+"**");
        System.out.println();
        System.out.println("	                          11. Truffle Fries               299/-  ");
        System.out.println("	                          12. Animl Style Fries           229/-  ");
        System.out.println("	                          13. Spinach Mushroom Sandwich   528/-  ");
        System.out.println("	                          14. Pesto veg Sandwich          528/-  ");
        System.out.println("	                          15. Fried Paneer Momos          180/-  ");
        System.out.println();
	try
	{
		Thread.sleep(2892);
	}
	catch(Exception e){}

        System.out.println("	                       	**"+cyan+"Freeze"+reset+"**");
        System.out.println();
        System.out.println("	                          16. Tropical Ice Cream              145/-  ");
        System.out.println("	                          17. Vegan Kala Jamun Ice Cream      145/-  ");
        System.out.println("	                          18. Alphonso Mango Ice Cream        145/-  ");
        System.out.println("	                          19. Pistachio Butter Ice Cream      145/-  ");
        System.out.println("	                          20. Cookies and Creams Ice Cream    289/-  ");
	try
	{
		Thread.sleep(964);
	}
	catch(Exception e){}

        System.out.println("	                          21. "+red+"Exit"+reset+"          ");
        System.out.println("	                       ===================================================================");
        System.out.println("                       Hello couples!!!!...What Do You Want to Order ..??");

	}//Fried


	void displaymenu2()
	{
			System.out.println(green+"WELCOME TO"+reset);

		String fd1 = ("		- - -  - - -  -   -  - - -  -   -    - - -  -   -      -      -      - - - ' - - -");
		String fd2 = ("		-      -   -  -   -    -    -   -      -    -   -     - -     -        -     -");
		String fd3 = ("		- - -  -   -  -   -    -    - - -      -    - - -    - - -    -        -     - - -");
		String fd4 = ("		    -  -   -  -   -    -    -   -      -    -   -   -     -   -        -         -");
      		String fd5 = ("		- - -  - - -  - - -    -    -   -      -    -   -  -       -  - - -  - - -   - - - ");
			 System.out.print(bold);
			for(int i = 0;i<fd1.length();i++)
			{
				System.out.print(yellow);
				try
				{
					System.out.print(fd1.charAt(i));
					Thread.sleep(27);
				}
				catch(Exception e){}
			}
			System.out.println(reset);
			for(int i = 0;i<fd2.length();i++)
			{
				System.out.print(yellow);
				try
				{
					System.out.print(fd2.charAt(i));
					Thread.sleep(27);
				}
				catch(Exception e){}
			}
			System.out.println(reset);
			for(int i = 0;i<fd3.length();i++)
			{
				System.out.print(yellow);
				try
				{
					System.out.print(fd3.charAt(i));
					Thread.sleep(27);
				}
				catch(Exception e){}
			}
			System.out.println(reset);
			for(int i = 0;i<fd4.length();i++)
			{
				System.out.print(yellow);
				try
				{
					System.out.print(fd4.charAt(i));
					Thread.sleep(27);
				}
				catch(Exception e){}
			}
			System.out.println(reset);
			for(int i = 0;i<fd5.length();i++)
			{
				System.out.print(yellow);
				try
				{
					System.out.print(fd5.charAt(i));
					Thread.sleep(27);
				}
				catch(Exception e){}
			}
			System.out.println(reset);
	try
	{
		Thread.sleep(964);
	}
	catch(Exception e){}

        System.out.println("	                       ===================================================================");
        System.out.println("	                       	**"+red+"NON-VEG ITEMS"+reset+"**   ");
        System.out.println();
        System.out.println("	                           1. Butter Chicken Deluxe Thali                          408/-");
        System.out.println("	                           2. Palak Chicken Deluxe Thali                           388/-");
        System.out.println("	                           3. Masala Egg curry,Paratha Thali                       249/-");
        System.out.println("	                           4. Chicken Manchurian Fried Rice Bowl                   299/-");
        System.out.println("	                           5. Chicken Hakka Noodles Bowl                           348/-");
        System.out.println("	                           6. Lasooni Methi Chicken,Bhindhi Chana& Jeera Pulao     269/-");
        System.out.println("	                           7. Butter Chicken Aloo Ghobi&Jeera Pulao                279/-");
        System.out.println("	                           8. Shahi Murgh Biryani                                  368/-");
        System.out.println("	                           9. Lasooni Methi Chicken Thali                          308/-");
        System.out.println("	                          10. Kadhai Chicken Thali Meal                            298/-");
        System.out.println();
	try
	{
		Thread.sleep(964);
	}
	catch(Exception e){}

        System.out.println("	                       	**"+green+"VEG ITEMS"+reset+"**");
        System.out.println();
        System.out.println("	                          11. Banarasi Dum Aloo Thali meal     258/-  ");
        System.out.println("	                          12. Paneer Makhani Thali Meal        298/-  ");
        System.out.println("	                          13. Subz Kadhai Mini Meal            228/-  ");
        System.out.println("	                          14. Amritsari Chole Mini Meal        199/-  ");
        System.out.println("	                          15. Dilli Wale Rajma Rice Bowl       199/-  ");
        System.out.println();
	try
	{
		Thread.sleep(2892);
	}
	catch(Exception e){}

        System.out.println("	                       	**"+cyan+"DRINKS & CREAMS"+reset+"**");
        System.out.println();
        System.out.println("	                          16. Pepsi Black                  79/-  ");
        System.out.println("	                          17. Masala Lemonade              48/-  ");
        System.out.println("	                          18. Masala Raita                 35/-  ");
        System.out.println("	                          19. Wild Forest Berries          89/-  ");
        System.out.println("	                          20. Dry Fruit Overload Kulfi    289/-  ");
	try
	{
		Thread.sleep(964);
	}
	catch(Exception e){}

        System.out.println("	                          21. "+red+"Exit"+reset+"          ");
        System.out.println("	                       ===================================================================");
        System.out.println("                       Hello couples!!!!...What Do You Want to Order ..??");

	}//souththali

    void displaymenu1() 
    {
	System.out.println(green+"WELCOME TO"+reset);

		String fd1 = ("		- - -  - - -  - - -  - - -    ' -     - '     - - -  - - -  - - - -   -    -      -     -  - - -"); 
		String fd2 = ("		-   -  -      -        -        - -   -       -   -    -    -   -  - -    - -     - -   -    -");
		String fd3 = ("		- - -  - -    - - -    -        -  -  -       - - -    -    - - -   -    - - -    -  -  -    -");
		String fd4 = ("		-   -  -          -    -        -   - -       -   -    -    - -     -   -     -   -   - -    -");
		String fd5 = ("		- - -  - - -  - - -    -        -     -       - - -  - - -  -   -   -  -       -  -     -  - - -");
			 System.out.print(bold);
			for(int i = 0;i<fd1.length();i++)
			{
				System.out.print(yellow);
				try
				{
					System.out.print(fd1.charAt(i));
					Thread.sleep(27);
				}
				catch(Exception e){}
			}
			System.out.println(reset);
			for(int i = 0;i<fd2.length();i++)
			{
				System.out.print(yellow);
				try
				{
					System.out.print(fd2.charAt(i));
					Thread.sleep(27);
				}
				catch(Exception e){}
			}
			System.out.println(reset);
			for(int i = 0;i<fd3.length();i++)
			{
				System.out.print(yellow);
				try
				{
					System.out.print(fd3.charAt(i));
					Thread.sleep(27);
				}
				catch(Exception e){}
			}
			System.out.println(reset);
			for(int i = 0;i<fd4.length();i++)
			{
				System.out.print(yellow);
				try
				{
					System.out.print(fd4.charAt(i));
					Thread.sleep(27);
				}
				catch(Exception e){}
			}
			System.out.println(reset);
			for(int i = 0;i<fd5.length();i++)
			{
				System.out.print(yellow);
				try
				{
					System.out.print(fd5.charAt(i));
					Thread.sleep(27);
				}
				catch(Exception e){}
			}
			System.out.println(reset);
	try
	{
		Thread.sleep(964);
	}
	catch(Exception e){}

        System.out.println("	                       =====================================================");
        System.out.println("	                       	**"+red+"NON-VEG ITEMS"+reset+"**   ");
        System.out.println();
        System.out.println("	                           1. Royal chicken Biryani                   199/-");
        System.out.println("	                           2. Supreme chicken Dum Biriyani           1499/-");
        System.out.println("	                           3. Nizami Mutton Dum Biryani               489/-");
        System.out.println("	                           4. Egg Biryani                             349/-");
        System.out.println("	                           5. Nizami Chicken Dum Biryani              299/-");
        System.out.println("	                           6. Royal Fiery Chicken Dum Biriyani(BL)    289/-");
        System.out.println("	                           7. SP Chicken Dum Biryani(x2 Meat)         629/-");
        System.out.println("	                           8. Nizami Fiery Chicken Dum Biryani(BL)    429/-");
        System.out.println("	                           9. Chicken Fiery Kebab                     369/-");
        System.out.println("	                          10. Chicken Kalmi Kebab                     419/-");
        System.out.println();
	try
	{
		Thread.sleep(964);
	}
	catch(Exception e){}

        System.out.println("	                       	**"+green+"VEG ITEMS"+reset+"**");
        System.out.println();
        System.out.println("	                          11. Special Veg Dum Biryani      339/-  ");
        System.out.println("	                          12. Mushroom Biryani             219/-  ");
        System.out.println("	                          13. Paneer Biryani               219/-  ");
        System.out.println("	                          14. Mushroom Manchurian          149/-  ");
        System.out.println("	                          15. Paneer Manchurian            159/-  ");
        System.out.println();
	try
	{
		Thread.sleep(2892);
	}
	catch(Exception e){}

        System.out.println("	                       	**"+cyan+"DRINKS (Beverages)"+reset+"**");
        System.out.println();
        System.out.println("	                          16. Coke Pet                40/-  ");
        System.out.println("	                          17. Sprite pet              40/-  ");
        System.out.println("	                          18. Thums up pet            50/-  ");
        System.out.println("	                          19. Pepsi pet               70/-  ");
        System.out.println("	                          20. Fruit Mix Ice Creams    80/-  ");
	try
	{
		Thread.sleep(964);
	}
	catch(Exception e){}

        System.out.println("	                          21. "+red+"Exit"+reset+"          ");
        System.out.println("	                       =====================================================");
        System.out.println("                       Hello couples!!!!...What Do You Want to Order ..??");

    }//biriyani

    void quant(int f)
	{
		System.out.print(reset);
		if(f>=1&&f<=80)
		{
			Quantity = f;
		}
		else if(f==0)
		{
			System.out.print("Sorry we apologize '0' is not an option "+green+"Try again"+reset+"\n	                       ");
			quant(hi.nextInt());
		}
		else
		{
			System.out.print("Are you human or Animal.. Enter "+green+"again"+reset+" at range of 60\n	                       ");
			quant(hi.nextInt());
		}
	
	}//food

	void GenerateBillf() 
	{
        System.out.println();
        System.out.println("**THANK YOU FOR ORDERING**");
        System.out.println("\n	                          Total amount    : " + Total);
        Amt = Total * 0.15;
        System.out.println("	                          Discount amount :- " + Amt);
        Total = Total - Amt;
		double tax = Total*0.05;
	System.out.println("	                 Taxes total(CGST + SGST) : "+tax);
		Total = Total + tax;

    	}//food

	void billf(double a)
	{
		System.out.print(reset);
		if(Total == a) 
			{
            		System.out.println(blue+"	                       Payment Successful"+reset+"\n");
             		System.out.println("	                  THANK YOU.....DEAR COUPLES... "+blink+"VISIT AGAIN"+reset+".....");
			System.out.print("	                       		  "+h+reset);
        		} 
			else
			{
            		System.out.println("Transaction Failed");
           			System.out.println(red+"Please Check what you have Entered..."+reset+"& "+green+"Try Again..."+reset);
				System.out.print(green);
				billf(hi.nextDouble());
      		}
	}//food

	void orderf1()
	{
			System.out.print(blue);
            		X = hi.nextInt();
			System.out.print(reset);
            	if(X==1) 
			{
                    System.out.println("You have selected Royal chicken Biryani");
                    System.out.println();
                    System.out.print("	                       Enter the Quantity : ");
				System.out.print(blueh);
                    quant(hi.nextInt());
                    Total = Total + Quantity* RoyalchickenBiryani;
                    
			}
                if(X==2)
			{
                    System.out.println("You have selected Supreme chicken Dum Biryani");
                    System.out.println();
            		System.out.print("	                       Enter the Quantity : ");
				System.out.print(blueh);
                    quant(hi.nextInt());
                    Total = Total + Quantity * SupremechickenDumBiryani;
			}
                if(X==3)
			{
                    System.out.println("You have selected Nizami Mutton Dum Biryani");
                    System.out.println();
            		System.out.print("	                       Enter the Quantity : ");
				System.out.print(blueh);
                    quant(hi.nextInt());
                    Total = Total + Quantity * NizamiMuttonDumBiryani;
			}
                if(X==4)
			{
                    System.out.println("You have selected Egg Biryani");
                    System.out.println();
            		System.out.print("	                       Enter the Quantity : ");
				System.out.print(blueh);
                    quant(hi.nextInt());
                    Total = Total + Quantity * EggBiryani;
                   }

                if(X==5)
			{
                    System.out.println("You have selected Nizami Chicken Dum Biryani");
                    System.out.println();
            		System.out.print("	                       Enter the Quantity : ");
				System.out.print(blueh);
                    quant(hi.nextInt());
                    Total = Total + Quantity * NizamiChickenDumBiryani;
                   }

                if(X==6)
			{
                    System.out.println("You have selected Royal Fiery Chicken Dum Biryani(BL)");
                    System.out.println();
            		System.out.print("	                       Enter the Quantity : ");
				System.out.print(blueh);
                    quant(hi.nextInt());
                    Total = Total + Quantity * RoyalFieryChickenDumBiryaniBL;
			}
                if(X==7)
			{
                    System.out.println("You have selected SP Chicken Dum Biryani(x2 Meat)");
                    System.out.println();
            		System.out.print("	                       Enter the Quantity : ");
				System.out.print(blueh);
                    quant(hi.nextInt());
                    Total = Total + Quantity * SPChickenDumBiryanix2Meat;
                   } 
                if(X==8)
			{
                   	System.out.println("You have selected Nizami Fiery Chicken Dum Biryani(BL)");
            		System.out.println();
            		System.out.print("	                       Enter the Quantity : ");
				System.out.print(blueh);
                    	quant(hi.nextInt());
            		Total = Total + Quantity*NizamiFieryChickenDumBiryaniBL;
            		}
                if(X==9)
			{
            		System.out.println("You have selected Chicken Fiery Kebab");
            		System.out.println();
            		System.out.print("	                       Enter the Quantity : ");
				System.out.print(blueh);
	                    quant(hi.nextInt());
            		Total = Total + Quantity*ChickenFieryKebab;
            		}
                if(X==10)
			{
            		System.out.println("You have selected Chicken Kalmi Kebab");
            		System.out.println();
            		System.out.print("	                       Enter the Quantity : ");
				System.out.print(blueh);
	                    quant(hi.nextInt());
            		Total = Total + Quantity*ChickenKalmiKebab;
            		}
            
                if(X==11)
			{
            		System.out.println("You have selected Special Veg Dum Biryani");
            		System.out.println();
            		System.out.print("	                       Enter the Quantity : ");
				System.out.print(blueh);
	                    quant(hi.nextInt());
            		Total = Total + Quantity*SpecialVegDumBiryani;
            		}
            
                if(X==12)
			{
            		System.out.println("You have selected Mushroom Biryani");
            		System.out.println();
            		System.out.print("	                       Enter the Quantity : ");
				System.out.print(blueh);
	                    quant(hi.nextInt());
            		Total = Total + Quantity*MushroomBiryani;
            		}            
                if(X==13)
			{
            		System.out.println("You have selected Paneer Biryani");
            		System.out.println();
            		System.out.print("	                       Enter the Quantity : ");
				System.out.print(blueh);
	                    quant(hi.nextInt());
            		Total = Total + Quantity*PaneerBiryani;
            		}            
                if(X==14)
			{
            		System.out.println("You have selected Mushroom Manchurian");
           			System.out.println();
            		System.out.print("	                       Enter the Quantity : ");
				System.out.print(blueh);
	                    quant(hi.nextInt());
            		Total = Total + Quantity*MushroomManchurian;
			}
                if(X==15)
			{
            		System.out.println("You have selected Paneer Manchurian");
            		System.out.println();
            		System.out.print("	                       Enter the Quantity : ");
				System.out.print(blueh);
	                    quant(hi.nextInt());
            		Total = Total + Quantity*PaneerManchurian;
           		}
                if(X==16)
			{
		            System.out.println("You have selected Coke Pet");
            		System.out.println();
            		System.out.print("	                       Enter the Quantity : ");
				System.out.print(blueh);
	                    quant(hi.nextInt());
            		Total = Total + Quantity*CokePet;
            		}
                if(X==17)
			{
            		System.out.println("You have selected Sprite pet");
            		System.out.println();
            		System.out.print("	                       Enter the Quantity : ");
				System.out.print(blueh);
	                    quant(hi.nextInt());
            		Total = Total + Quantity*Spritepet;
            		}
                if(X==18)
			{
            		System.out.println("You have selected Thums up pet");
            		System.out.println();
            		System.out.print("	                       Enter the Quantity : ");
				System.out.print(blueh);
	                    quant(hi.nextInt());
            		Total = Total + Quantity*Thumsuppet;
            		}
                if(X==19)
			{
            		System.out.println("You have selected Pepsi pet");
            		System.out.println();
            		System.out.print("	                       Enter the Quantity : ");
				System.out.print(blueh);
	                    quant(hi.nextInt());
            		Total = Total + Quantity*Pepsipet;
            		}
                if(X==20)
			{
            		System.out.println("You have selected Fruit Mix Ice Creams");
            		System.out.println();
            		System.out.print("	                       Enter the Quantity : ");
				System.out.print(blueh);
	                    quant(hi.nextInt());
            		Total = Total + Quantity*FruitMixIceCreams;
            		}
                if(X==21)
			{
       
                  }
            
	  if(X>=1 && X<=20)
	  {
            System.out.println();
            System.out.print("Do You Wish To Order Anything else: "+green+"Yes"+reset+"	 |	"+red+"No"+reset+"\n	                       ");
            String again = hi.next();
            if (again.equalsIgnoreCase("YES")||again.equalsIgnoreCase("Y")||again.equals("1")) 
            {
	           	System.out.print("\n	                       Enter Your Choice....\n	                       num-");
                orderf1();
            } 
            else if (again.equalsIgnoreCase("NO")||again.equalsIgnoreCase("N")||again.equals("2"))
            {
                GenerateBillf();
            } 
            else 
            {
                System.out.println("We Considered It as "+red+"NO"+reset);
            }
        
	   }
		else if(X!=21)
		{
			System.out.println("You entered wrong choice "+green+"TRY again"+reset);
			orderf1();	
		}

    	}//orderf1

	void orderf2()
	{
			System.out.print(blue);
            		X = hi.nextInt();
			System.out.print(reset);
            	if(X==1) 
			{
                    System.out.println("You have selected Butter Chicken Deluxe Thali");
                    System.out.println();
            		System.out.print("	                       Enter the Quantity : ");
				System.out.print(blueh);
                    quant(hi.nextInt());
                    Total = Total + Quantity* ButterChickenDeluxeThali;
                    
			}
                if(X==2)
			{
                    System.out.println("You have selected Palak Chicken Deluxe Thali ");
                    System.out.println();
            		System.out.print("	                       Enter the Quantity : ");
				System.out.print(blueh);
                    quant(hi.nextInt());
                    Total = Total + Quantity * PalakChickenDeluxeThali;
			}
                if(X==3)
			{
                    System.out.println("You have selected Masala Egg curry,Paratha Thali");
                    System.out.println();
            		System.out.print("	                       Enter the Quantity : ");
				System.out.print(blueh);
                    quant(hi.nextInt());
                    Total = Total + Quantity * MasalaEggcurryParathaThali;
			}
                if(X==4)
			{
                    System.out.println("You have selected Chicken Manchurian Fried Rice Bowl");
                    System.out.println();
            		System.out.print("	                       Enter the Quantity : ");
				System.out.print(blueh);
                    quant(hi.nextInt());
                    Total = Total + Quantity * ChickenManchurianFriedRiceBowl;
                   }

                if(X==5)
			{
                    System.out.println("You have selected Chicken Hakka Noodles Bowl");
                    System.out.println();
            		System.out.print("	                       Enter the Quantity : ");
				System.out.print(blueh);
                    quant(hi.nextInt());
                    Total = Total + Quantity * ChickenHakkaNoodlesBowl;
                   }

                if(X==6)
			{
                    System.out.println("You have selected Lasooni Methi Chicken,Bhindhi Chana& Jeera Pulao");
                    System.out.println();
            		System.out.print("	                       Enter the Quantity : ");
				System.out.print(blueh);
                    quant(hi.nextInt());
                    Total = Total + Quantity * LasooniMethiChickenBhindhiChanaJeeraPulao;
			}
                if(X==7)
			{
                    System.out.println("You have selected Butter Chicken Aloo Ghobi&Jeera Pulao");
                    System.out.println();
            		System.out.print("	                       Enter the Quantity : ");
				System.out.print(blueh);
                    quant(hi.nextInt());
                    Total = Total + Quantity*ButterChickenAlooGhobiJeeraPulao ;
                   } 
                if(X==8)
			{
                   	System.out.println("You have selected Shahi Murgh Biryani");
            		System.out.println();
            		System.out.print("	                       Enter the Quantity : ");
				System.out.print(blueh);
                    	quant(hi.nextInt());
            		Total = Total + Quantity*ShahiMurghBiryani;
            	}
                if(X==9)
			{
            		System.out.println("You have selected Lasooni Methi Chicken Thali");
            		System.out.println();
            		System.out.print("	                       Enter the Quantity : ");
				System.out.print(blueh);
	                    quant(hi.nextInt());
            		Total = Total + Quantity*LasooniMethiChickenThali;
            	}
                if(X==10)
			{
            		System.out.println("You have selected Kadhai Chicken Thali Meal");
            		System.out.println();
            		System.out.print("	                       Enter the Quantity : ");
				System.out.print(blueh);
	                    quant(hi.nextInt());
            		Total = Total + Quantity*KadhaiChickenThaliMeal;
            	}
            
                if(X==11)
			{
            		System.out.println("You have selected Banarasi Dum Aloo Thali meal");
            		System.out.println();
            		System.out.print("	                       Enter the Quantity : ");
				System.out.print(blueh);
	                    quant(hi.nextInt());
            		Total = Total + Quantity*BanarasiDumAlooThalimeal;
            	}
            
                if(X==12)
			{
            		System.out.println("You have selected Paneer Makhani Thali Meal ");
            		System.out.println();
            		System.out.print("	                       Enter the Quantity : ");
				System.out.print(blueh);
	                    quant(hi.nextInt());
            		Total = Total + Quantity*PaneerMakhaniThaliMeal;
            	}            
                if(X==13)
			{
            		System.out.println("You have selected Subz Kadhai Mini Meal");
            		System.out.println();
            		System.out.print("	                       Enter the Quantity : ");
				System.out.print(blueh);
	                    quant(hi.nextInt());
            		Total = Total + Quantity*SubzKadhaiMiniMeal;
            	}            
                if(X==14)
			{
            		System.out.println("You have selected Amritsari Chole Mini Meal");
           			System.out.println();
            		System.out.print("	                       Enter the Quantity : ");
				System.out.print(blueh);
	                    quant(hi.nextInt());
            		Total = Total + Quantity*AmritsariCholeMiniMeal;
			}
                if(X==15)
			{
            		System.out.println("You have selected Dilli Wale Rajma Rice Bowl");
            		System.out.println();
            		System.out.print("	                       Enter the Quantity : ");
				System.out.print(blueh);
	                    quant(hi.nextInt());
            		Total = Total + Quantity*DilliWaleRajmaRiceBowl;
           		}
                if(X==16)
			{
		            System.out.println("You have selected Pepsi Black");
            		System.out.println();
            		System.out.print("	                       Enter the Quantity : ");
				System.out.print(blueh);
	                    quant(hi.nextInt());
            		Total = Total + Quantity*PepsiBlack;
            	}
                if(X==17)
			{
            		System.out.println("You have selected Masala Lemonade");
            		System.out.println();
            		System.out.print("	                       Enter the Quantity : ");
				System.out.print(blueh);
	                    quant(hi.nextInt());
            		Total = Total + Quantity*MasalaLemonade;
            	}
                if(X==18)
			{
            		System.out.println("You have selected Masala Raita");
            		System.out.println();
            		System.out.print("	                       Enter the Quantity : ");
				System.out.print(blueh);
	                    quant(hi.nextInt());
            		Total = Total + Quantity*MasalaRaita;
            	}
                if(X==19)
			{
            		System.out.println("You have selected Wild Forest Berries");
            		System.out.println();
            		System.out.print("	                       Enter the Quantity : ");
				System.out.print(blueh);
	                    quant(hi.nextInt());
            		Total = Total + Quantity*WildForestBerries;
            	}
                if(X==20)
			{
            		System.out.println("You have selected Dry Fruit Overload Kulfi");
            		System.out.println();
            		System.out.print("	                       Enter the Quantity : ");
				System.out.print(blueh);
	                    quant(hi.nextInt());
            		Total = Total + Quantity*DryFruitOverloadKulfi;
            	}
                if(X==21)
			{
       
                  }
            
	  if(X>=1 && X<=20)
	  {
            System.out.println();
            System.out.print("Do You Wish To Order Anything else: "+green+"Yes"+reset+"	 |	"+red+"No"+reset+"\n	                       ");
            String again = hi.next();
            if (again.equalsIgnoreCase("YES")||again.equalsIgnoreCase("Y")||again.equals("1")) 
            {
	           	System.out.print("\n	                      Enter Your Choice....\n	                       num-");
                orderf2();
            } 
            else if (again.equalsIgnoreCase("NO")||again.equalsIgnoreCase("N")||again.equals("2"))
            {
                GenerateBillf();
            } 
            else 
            {
                System.out.println("We Considered It as "+red+"NO"+reset);
            }
        
	   }
		else if(X!=21)
		{
			System.out.println("You entered wrong choice "+green+"TRY again"+reset);
			orderf2();	
		}

    	}//orderf2

	void orderf3()
	{
			System.out.print(blue);
            		X = hi.nextInt();
			System.out.print(reset);
            	if(X==1) 
			{
                    System.out.println("You have selected Prosciutto Funghi Sandwich");
                    System.out.println();
            		System.out.print("	                       Enter the Quantity : ");
				System.out.print(blueh);
                    quant(hi.nextInt());
                    Total = Total + Quantity*ProsciuttoFunghiSandwich;
                    
			}
                if(X==2)
			{
                    System.out.println("You have selected Pesto Chicken Sandwich");
                    System.out.println();
            		System.out.print("	                       Enter the Quantity : ");
				System.out.print(blueh);
                    quant(hi.nextInt());
                    Total = Total + Quantity *PestoChickenSandwich ;
			}
                if(X==3)
			{
                    System.out.println("You have selected Chicken Bolongnese Lasagne");
                    System.out.println();
            		System.out.print("	                       Enter the Quantity : ");
				System.out.print(blueh);
                    quant(hi.nextInt());
                    Total = Total + Quantity * ChickenBolongneseLasagne;
			}
                if(X==4)
			{
                    System.out.println("You have selected Classic With Roasted Chicken & Sundried Tomatoes");
                    System.out.println();
            		System.out.print("	                       Enter the Quantity : ");
				System.out.print(blueh);
                    quant(hi.nextInt());
                    Total = Total + Quantity * ClassicWithRoastedChickenSundriedTomatoes;
                   }

                if(X==5)
			{
                    System.out.println("You have selected Chicken Ham Calzone");
                    System.out.println();
            		System.out.print("	                       Enter the Quantity : ");
				System.out.print(blueh);
                    quant(hi.nextInt());
                    Total = Total + Quantity *ChickenHamCalzone ;
                   }

                if(X==6)
			{
                    System.out.println("You have selected Pork Calabrian Calzone ");
                    System.out.println();
            		System.out.print("	                       Enter the Quantity : ");
				System.out.print(blueh);
                    quant(hi.nextInt());
                    Total = Total + Quantity * PorkCalabrianCalzone ;
			}
                if(X==7)
			{
                    System.out.println("You have selected Chicken Schezwan Fried Rice");
                    System.out.println();
            		System.out.print("	                       Enter the Quantity : ");
				System.out.print(blueh);
                    quant(hi.nextInt());
                    Total = Total + Quantity*ChickenSchezwanFriedRice;
                   } 
                if(X==8)
			{
                   	System.out.println("You have selected Egg Fried Rice ");
            		System.out.println();
            		System.out.print("	                       Enter the Quantity : ");
				System.out.print(blueh);
                    	quant(hi.nextInt());
            		Total = Total + Quantity*EggFriedRice;
            	}
                if(X==9)
			{
            		System.out.println("You have selected Flaming Hot Chicken Wings");
            		System.out.println();
            		System.out.print("	                       Enter the Quantity : ");
				System.out.print(blueh);
	                    quant(hi.nextInt());
            		Total = Total + Quantity*FlamingHotChickenWings;
            	}
                if(X==10)
			{
            		System.out.println("You have selected Flaming Hot Chicken Tenders");
            		System.out.println();
            		System.out.print("	                       Enter the Quantity : ");
				System.out.print(blueh);
	                    quant(hi.nextInt());
            		Total = Total + Quantity*FlamingHotChickenTenders;
            	}
            
                if(X==11)
			{
            		System.out.println("You have selected Truffle Fries");
            		System.out.println();
            		System.out.print("	                       Enter the Quantity : ");
				System.out.print(blueh);
	                    quant(hi.nextInt());
            		Total = Total + Quantity*TruffleFries;
            	}
            
                if(X==12)
			{
            		System.out.println("You have selected Animl Style Fries");
            		System.out.println();
            		System.out.print("	                       Enter the Quantity : ");
				System.out.print(blueh);
	                    quant(hi.nextInt());
            		Total = Total + Quantity*AnimlStyleFries;
            	}            
                if(X==13)
			{
            		System.out.println("You have selected Spinach Mushroom Sandwich");
            		System.out.println();
            		System.out.print("	                       Enter the Quantity : ");
				System.out.print(blueh);
	                    quant(hi.nextInt());
            		Total = Total + Quantity*SpinachMushroomSandwich;
            	}            
                if(X==14)
			{
            		System.out.println("You have selected Pesto veg Sandwich");
           			System.out.println();
            		System.out.print("	                       Enter the Quantity : ");
				System.out.print(blueh);
	                    quant(hi.nextInt());
            		Total = Total + Quantity*PestovegSandwich;
			}
                if(X==15)
			{
            		System.out.println("You have selected Fried Paneer Momos");
            		System.out.println();
            		System.out.print("	                       Enter the Quantity : ");
				System.out.print(blueh);
	                    quant(hi.nextInt());
            		Total = Total + Quantity*FriedPaneerMomos;
           		}
                if(X==16)
			{
		            System.out.println("You have selected Tropical Ice Cream");
            		System.out.println();
            		System.out.print("	                       Enter the Quantity : ");
				System.out.print(blueh);
	                    quant(hi.nextInt());
            		Total = Total + Quantity*TropicalIceCream;
            	}
                if(X==17)
			{
            		System.out.println("You have selected Vegan Kala Jamun Ice Cream");
            		System.out.println();
            		System.out.print("	                       Enter the Quantity : ");
				System.out.print(blueh);
	                    quant(hi.nextInt());
            		Total = Total + Quantity*VeganKalaJamunIceCream;
            	}
                if(X==18)
			{
            		System.out.println("You have selected Alphonso Mango Ice Cream");
            		System.out.println();
            		System.out.print("	                       Enter the Quantity : ");
				System.out.print(blueh);
	                    quant(hi.nextInt());
            		Total = Total + Quantity*AlphonsoMangoIceCream;
            	}
                if(X==19)
			{
            		System.out.println("You have selected Pistachio Butter Ice Cream");
            		System.out.println();
            		System.out.print("	                       Enter the Quantity : ");
				System.out.print(blueh);
	                    quant(hi.nextInt());
            		Total = Total + Quantity*PistachioButterIceCream;
            	}
                if(X==20)
			{
            		System.out.println("You have selected Cookies and Creams Ice Cream");
            		System.out.println();
            		System.out.print("	                       Enter the Quantity : ");
				System.out.print(blueh);
	                    quant(hi.nextInt());
            		Total = Total + Quantity*CookiesandCreamsIceCream;
            	}
                if(X==21)
			{
       
                  }
            
	  if(X>=1 && X<=20)
	  {
            System.out.println();
            System.out.print("Do You Wish To Order Anything else: "+green+"Yes"+reset+"	 |	"+red+"No"+reset+"\n	                       ");
            String again = hi.next();
            if (again.equalsIgnoreCase("YES")||again.equals("1")) 
            {
	           	System.out.print("\n	                       Enter Your Choice....\n	                       num-");
                orderf3();
            } 
            else if (again.equalsIgnoreCase("NO")||again.equals("2"))
            {
                GenerateBillf();
            } 
            else 
            {
                System.out.println("We Considered It as "+red+"NO"+reset);
            }
        
	   }
		else if(X!=21)
		{
			System.out.println("You entered wrong choice "+green+"TRY again"+reset);
			orderf3();	
		}

    	}//orderf3

	void orderf4()
	{
			System.out.print(blue);
            		X = hi.nextInt();
			System.out.print(reset);
            	if(X==1) 
			{
                    System.out.println("You have selected Chicken 65 Pizza");
                    System.out.println();
            		System.out.print("	                       Enter the Quantity : ");
				System.out.print(blueh);
                    quant(hi.nextInt());
                    Total = Total + Quantity*Chicken65Pizza;
                    
			}
                if(X==2)
			{
                    System.out.println("You have selected Barbeque Chicken Pizza");
                    System.out.println();
            		System.out.print("	                       Enter the Quantity : ");
				System.out.print(blueh);
                    quant(hi.nextInt());
                    Total = Total + Quantity *BarbequeChickenPizza;
			}
                if(X==3)
			{
                    System.out.println("You have selected Chicken Arrabbiata Pasta");
                    System.out.println();
            		System.out.print("	                       Enter the Quantity : ");
				System.out.print(blueh);
                    quant(hi.nextInt());
                    Total = Total + Quantity * ChickenArrabbiataPasta;
			}
                if(X==4)
			{
                    System.out.println("You have selected Chicken Alfredo Pasta");
                    System.out.println();
            		System.out.print("	                       Enter the Quantity : ");
				System.out.print(blueh);
                    quant(hi.nextInt());
                    Total = Total + Quantity *ChickenAlfredoPasta ;
                   }

                if(X==5)
			{
                    System.out.println("You have selected Barbeque Chicken Wings");
                    System.out.println();
            		System.out.print("	                       Enter the Quantity : ");
				System.out.print(blueh);
                    quant(hi.nextInt());
                    Total = Total + Quantity * BarbequeChickenWings;
                   }

                if(X==6)
			{
                    System.out.println("You have selected Smash Lamb Cheese Burger");
                    System.out.println();
            		System.out.print("	                       Enter the Quantity : ");
				System.out.print(blueh);
                    quant(hi.nextInt());
                    Total = Total + Quantity * SmashLambCheeseBurger;
			}
                if(X==7)
			{
                    System.out.println("You have selected Monster Cheese Burger");
                    System.out.println();
            		System.out.print("	                       Enter the Quantity : ");
				System.out.print(blueh);
                    quant(hi.nextInt());
                    Total = Total + Quantity*MonsterCheeseBurger;
                   } 
                if(X==8)
			{
                   	System.out.println("You have selected Chicken Burger");
            		System.out.println();
            		System.out.print("	                       Enter the Quantity : ");
				System.out.print(blueh);
                    	quant(hi.nextInt());
            		Total = Total + Quantity*ChickenBurger;
            	}
                if(X==9)
			{
            		System.out.println("You have selected Buff Burger");
            		System.out.println();
            		System.out.print("	                       Enter the Quantity : ");
				System.out.print(blueh);
	                    quant(hi.nextInt());
            		Total = Total + Quantity*BuffBurger;
            	}
                if(X==10)
			{
            		System.out.println("You have selected Spice Burger");
            		System.out.println();
            		System.out.print("	                       Enter the Quantity : ");
				System.out.print(blueh);
	                    quant(hi.nextInt());
            		Total = Total + Quantity*SpiceBurger;
            	}
            
                if(X==11)
			{
            		System.out.println("You have selected Tandoori Volcano Cheese Burger");
            		System.out.println();
            		System.out.print("	                       Enter the Quantity : ");
				System.out.print(blueh);
	                    quant(hi.nextInt());
            		Total = Total + Quantity*TandooriVolcanoCheeseBurger;
            	}
            
                if(X==12)
			{
            		System.out.println("You have selected Potato Krunch Burger");
            		System.out.println();
            		System.out.print("	                       Enter the Quantity : ");
				System.out.print(blueh);
	                    quant(hi.nextInt());
            		Total = Total + Quantity*PotatoKrunchBurger;
            	}            
                if(X==13)
			{
            		System.out.println("You have selected Barbeque Paneer Pizza");
            		System.out.println();
            		System.out.print("	                       Enter the Quantity : ");
				System.out.print(blueh);
	                    quant(hi.nextInt());
            		Total = Total + Quantity*BarbequePaneerPizza;
            	}            
                if(X==14)
			{
            		System.out.println("You have selected Margherita Pizza");
           			System.out.println();
            		System.out.print("	                       Enter the Quantity : ");
				System.out.print(blueh);
	                    quant(hi.nextInt());
            		Total = Total + Quantity*MargheritaPizza;
			}
                if(X==15)
			{
            		System.out.println("You have selected Veggie Paradise Pizza");
            		System.out.println();
            		System.out.print("	                       Enter the Quantity : ");
				System.out.print(blueh);
	                    quant(hi.nextInt());
            		Total = Total + Quantity*VeggieParadisePizza;
           		}
                if(X==16)
			{
		            System.out.println("You have selected Butterscotch Mousse Cake");
            		System.out.println();
            		System.out.print("	                       Enter the Quantity : ");
				System.out.print(blueh);
	                    quant(hi.nextInt());
            		Total = Total + Quantity*ButterscotchMousseCake;
            	}
                if(X==17)
			{
            		System.out.println("You have selected Red velvet Lava Cake");
            		System.out.println();
            		System.out.print("	                       Enter the Quantity : ");
				System.out.print(blueh);
	                    quant(hi.nextInt());
            		Total = Total + Quantity*RedvelvetLavaCake;
            	}
                if(X==18)
			{
            		System.out.println("You have selected Ferrero Rocher Sundae");
            		System.out.println();
            		System.out.print("	                       Enter the Quantity : ");
				System.out.print(blueh);
	                    quant(hi.nextInt());
            		Total = Total + Quantity*FerreroRocherSundae;
            	}
                if(X==19)
			{
            		System.out.println("You have selected Coco Walnut Brownie");
            		System.out.println();
            		System.out.print("	                       Enter the Quantity : ");
				System.out.print(blueh);
	                    quant(hi.nextInt());
            		Total = Total + Quantity*CocoWalnutBrownie;
            	}
                if(X==20)
			{
            		System.out.println("You have selected Black Forest Pastry");
            		System.out.println();
            		System.out.print("	                       Enter the Quantity : ");
				System.out.print(blueh);
	                    quant(hi.nextInt());
            		Total = Total + Quantity*BlackForestPastry;
            	}
                if(X==21)
			{
       
                  }
            
	  if(X>=1 && X<=20)
	  {
            System.out.println();
            System.out.print("Do You Wish To Order Anything else: "+green+"Yes"+reset+"	 |	"+red+"No"+reset+"\n	                       ");
            String again = hi.next();
            if (again.equalsIgnoreCase("YES")||again.equals("1")) 
            {
	           	System.out.print("\n	                       Enter Your Choice....\n	                       num-");
                orderf4();
            } 
            else if (again.equalsIgnoreCase("NO")||again.equals("2"))
            {
                GenerateBillf();
            } 
            else 
            {
                System.out.println("We Considered It as "+red+"NO"+reset);
            }
        
	   }
		else if(X!=21)
		{
			System.out.println("You entered wrong choice "+green+"TRY again"+reset);
			orderf4();	
		}

    	}//orderf4

	void orderf5()
	{
			System.out.print(blue);
            		X = hi.nextInt();
			System.out.print(reset);
            	if(X==1) 
			{
                    System.out.println("You have selected Oreo Shake");
                    System.out.println();
            		System.out.print("	                       Enter the Quantity : ");
				System.out.print(blueh);
                    quant(hi.nextInt());
                    Total = Total + Quantity*OreoShake;
                    
			}
                if(X==2)
			{
                    System.out.println("You have selected Watermelon Shake");
                    System.out.println();
            		System.out.print("	                       Enter the Quantity : ");
				System.out.print(blueh);
                    quant(hi.nextInt());
                    Total = Total + Quantity *WatermelonShake;
			}
                if(X==3)
			{
                    System.out.println("You have selected Black Grape Epic ");
                    System.out.println();
            		System.out.print("	                       Enter the Quantity : ");
				System.out.print(blueh);
                    quant(hi.nextInt());
                    Total = Total + Quantity *BlackGrapeEpic ;
			}
                if(X==4)
			{
                    System.out.println("You have selected Choco Nutella Smoothie ");
                    System.out.println();
            		System.out.print("	                       Enter the Quantity : ");
				System.out.print(blueh);
                    quant(hi.nextInt());
                    Total = Total + Quantity *ChocoNutellaSmoothie ;
                   }

                if(X==5)
			{
                    System.out.println("You have selected Brownie Nutella Thick Shake");
                    System.out.println();
            		System.out.print("	                       Enter the Quantity : ");
				System.out.print(blueh);
                    quant(hi.nextInt());
                    Total = Total + Quantity *BrownieNutellaThickShake;
                   }

                if(X==6)
			{
                    System.out.println("You have selected Blackcurrent Flake Thick Shake");
                    System.out.println();
            		System.out.print("	                       Enter the Quantity : ");
				System.out.print(blueh);
                    quant(hi.nextInt());
                    Total = Total + Quantity * BlackcurrentFlakeThickShake;
			}
                if(X==7)
			{
                    System.out.println("You have selected Ferrero Rocher Thick Shake");
                    System.out.println();
            		System.out.print("	                       Enter the Quantity : ");
				System.out.print(blueh);
                    quant(hi.nextInt());
                    Total = Total + Quantity*FerreroRocherThickShake;
                   } 
                if(X==8)
			{
                   	System.out.println("You have selected Vanilla Million Delight Thick Shake");
            		System.out.println();
            		System.out.print("	                       Enter the Quantity : ");
				System.out.print(blueh);
                    	quant(hi.nextInt());
            		Total = Total + Quantity*VanillaMillionDelightThickShake;
            	}
                if(X==9)
			{
            		System.out.println("You have selected Strawberry Fruits Lovers Milkshake");
            		System.out.println();
            		System.out.print("	                       Enter the Quantity : ");
				System.out.print(blueh);
	                    quant(hi.nextInt());
            		Total = Total + Quantity*StrawberryFruitsLoversMilkshake;
            	}
                if(X==10)
			{
            		System.out.println("You have selected Blueberry Lovers Thick Shake");
            		System.out.println();
            		System.out.print("	                       Enter the Quantity : ");
				System.out.print(blueh);
	                    quant(hi.nextInt());
            		Total = Total + Quantity*BlueberryLoversThickShake;
            	}
            
                if(X==11)
			{
            		System.out.println("You have selected Mosambi Juice");
            		System.out.println();
            		System.out.print("	                       Enter the Quantity : ");
				System.out.print(blueh);
	                    quant(hi.nextInt());
            		Total = Total + Quantity*MosambiJuice;
            	}
            
                if(X==12)
			{
            		System.out.println("You have selected Pineapple Juice");
            		System.out.println();
            		System.out.print("	                       Enter the Quantity : ");
				System.out.print(blueh);
	                    quant(hi.nextInt());
            		Total = Total + Quantity*PineappleJuice;
            	}            
                if(X==13)
			{
            		System.out.println("You have selected Watermelon Juice");
            		System.out.println();
            		System.out.print("	                       Enter the Quantity : ");
				System.out.print(blueh);
	                    quant(hi.nextInt());
            		Total = Total + Quantity*WatermelonJuice;
            	}            
                if(X==14)
			{
            		System.out.println("You have selected Banana Juice");
           			System.out.println();
            		System.out.print("	                       Enter the Quantity : ");
				System.out.print(blueh);
	                    quant(hi.nextInt());
            		Total = Total + Quantity*BananaJuice;
			}
                if(X==15)
			{
            		System.out.println("You have selected Orange Juice");
            		System.out.println();
            		System.out.print("	                       Enter the Quantity : ");
				System.out.print(blueh);
	                    quant(hi.nextInt());
            		Total = Total + Quantity*OrangeJuice;
           		}
                if(X==16)
			{
		            System.out.println("You have selected Brownie Fudge Sundae");
            		System.out.println();
            		System.out.print("	                       Enter the Quantity : ");
				System.out.print(blueh);
	                    quant(hi.nextInt());
            		Total = Total + Quantity*BrownieFudgeSundae;
            	}
                if(X==17)
			{
            		System.out.println("You have selected Choco Peanut Fudge Sundae");
            		System.out.println();
            		System.out.print("	                       Enter the Quantity : ");
				System.out.print(blueh);
	                    quant(hi.nextInt());
            		Total = Total + Quantity*ChocoPeanutFudgeSundae;
            	}
                if(X==18)
			{
            		System.out.println("You have selected Nutty Choco Caramel Sundae");
            		System.out.println();
            		System.out.print("	                       Enter the Quantity : ");
				System.out.print(blueh);
	                    quant(hi.nextInt());
            		Total = Total + Quantity*NuttyChocoCaramelSundae;
            	}
                if(X==19)
			{
            		System.out.println("You have selected Cookie Shot Sundae");
            		System.out.println();
            		System.out.print("	                       Enter the Quantity : ");
				System.out.print(blueh);
	                    quant(hi.nextInt());
            		Total = Total + Quantity*CookieShotSundae;
            	}
                if(X==20)
			{
            		System.out.println("You have selected Expresso Brownie Fudge Sundae");
            		System.out.println();
            		System.out.print("	                       Enter the Quantity : ");
				System.out.print(blueh);
	                    quant(hi.nextInt());
            		Total = Total + Quantity*ExpressoBrownieFudgeSundae;
            	}
                if(X==21)
		{
                  }
            
	  if(X>=1 && X<=20)
	  {
            System.out.println();
            System.out.print("Do You Wish To Order Anything else: "+green+"Yes"+reset+"	 |	"+red+"No"+reset+"\n	                       ");
            String again = hi.next();
            if (again.equalsIgnoreCase("YES")||again.equals("1")) 
            {
	           	System.out.print("\n	                       Enter Your Choice....\n	                       num-");
                orderf5();
            } 
            else if (again.equalsIgnoreCase("NO")||again.equals("2"))
            {
                GenerateBillf();
            } 
            else 
            {
                System.out.println("We Considered It as "+red+"NO"+reset);
            }
        
	   }
		else if(X!=21)
		{
			System.out.println("You entered wrong choice "+green+"TRY again"+reset);
			orderf5();	
		}

    	}//orderf5

		void bank1()
		{
			System.out.print("	                       "+whitebg+blue+" Paytm "+reset+"	"+whitebg+purpleh+" Phonepe "+reset+"	"+whitebg+blue+"G"+green+"oo"+yellow+"gle"+red+"pay"+reset+"	"+whitebg+black+" Cash "+reset+"\n	                       ");
			String payment = hi.next();
			if(payment.equalsIgnoreCase("PAYTM")||payment.equals("1"))
			{
				System.out.println("                       Thanks For Choosing Paytm");
				paytm();
			}
			else if(payment.equalsIgnoreCase("PHONEPE")||payment.equals("2"))
			{
				System.out.println("                       Thanks For Choosing PhonePe");
				phonepe();
			}
			else if(payment.equalsIgnoreCase("GOOGLEPAY")||payment.equals("3"))
			{
				System.out.println("                       Thanks For Choosing Google pay");
				googlepay();
			}
			else if(payment.equalsIgnoreCase("CASH")||payment.equals("4"))
			{
				System.out.println("	                       *******************************************");
        				System.out.println("	                            Amount to Pay   : " +blink+TotalT+reset);
        				System.out.println("	                       *******************************************");
        				System.out.print("	                      Plz Enter The Amount  : ");
       				billT(hi.nextDouble());
			}
			else
			{
				System.out.println("Please select Payment methods from these Only !");
				bank1();
			}

		}//bank1

    		void paytm()
    		{  
			System.out.print("Can we proceed with this "+cyan+chph+"@PAYTM"+reset+"   "+green+"Yes"+reset+"  |  "+red+"No"+reset+"  ?:");
			String proceed = hi.next();
			if(proceed.equalsIgnoreCase("YES")||proceed.equalsIgnoreCase("Y")||proceed.equals("1"))
			{
				otp();
			}
			else if(proceed.equalsIgnoreCase("NO")||proceed.equalsIgnoreCase("N")||proceed.equals("2"))
			{
				System.out.print("                          Enter your Paytm phone number : ");
				phonenumber();
				String gp = ph+"@PAYTM";
				System.out.println("\n	"+cyan+gp+reset+" is your Paytm UPI ID");
				otp();
			}
			else
			{
				paytm();
			}
        		
    		}//bank

        void phonepe()
        {
			System.out.print("Can we proceed with this "+purpleh+chph+"@PHONEPE"+reset+"   "+green+"Yes"+reset+"  |  "+red+"No"+reset+"  ?:");
			String proceed = hi.next();
			if(proceed.equalsIgnoreCase("YES")||proceed.equalsIgnoreCase("Y")||proceed.equals("1"))
			{
				otp();
			}
			else if(proceed.equalsIgnoreCase("NO")||proceed.equalsIgnoreCase("N")||proceed.equals("2"))
			{
				System.out.print("                          Enter your PhonePe phone number : ");
				phonenumber();
				String gp = ph+"@PHONEPE";
				System.out.println("\n	"+purpleh+gp+reset+" is your PhonePe UPI ID");
				otp();
			}
			else
			{
				phonepe();
			}

        }//bank

        void googlepay()
        {
			System.out.print("Can we proceed with this "+green+chph+"@GOOGLE"+reset+"   "+green+"Yes"+reset+"  |  "+red+"No"+reset+"  ?:");
			String proceed = hi.next();
			if(proceed.equalsIgnoreCase("YES")||proceed.equalsIgnoreCase("Y")||proceed.equals("1"))
			{
				otp();
			}
			else if(proceed.equalsIgnoreCase("NO")||proceed.equalsIgnoreCase("N")||proceed.equals("2"))
			{
				System.out.print("                          Enter your Google Pay phone number ");
				phonenumber();
				String gp = ph+"@GOOGLE";
				System.out.println("\n	"+green+gp+reset+" is your Google Pay UPI ID");
				otp();
			}
			else
			{
				googlepay();
			}

        }//bank
	
	void otp()
	{
		int gotp=10000+(int)(Math.random()*90000);
		System.out.println("\n	                           Otp : "+blink+red+"'"+whitebg+black+" "+gotp+" "+reset);
		try
		{
			System.out.print("\n	                       Please Enter Otp You have Recieved : ");
			Thread.sleep(964);

		}catch(Exception e){}

		int digit = hi.nextInt();
		if(gotp == digit)
		{
			System.out.println(blue+"\n	                       Payment Successful"+reset);
			System.out.println("	                       Your Payment Took "+(1+(int)(Math.random()*9))+"ms");
			System.out.println("\n	                  THANK YOU.....DEAR COUPLES... "+blink+"VISIT AGAIN"+reset+".....");
				System.out.println("	                       			"+h+reset);
		}
		else
		{
			System.out.println("You have Entered Wrong Otp. Please Wait You will Recieve another!");
			try
			{
				Thread.sleep(2300);
			}
			catch(Exception e){}
			otp();
		}

	}//bank

	void phonenumber()
	{
		ph = hi.next();
		if(ph.charAt(0)=='0')
		{
			System.out.println("Phone number doesn't starts with '0' & Enter again");
			phonenumber();
		}
		else if(ph.length()==10)
		{
			for(int i = 0;i<ph.length();i++)
			{
				if(ph.charAt(i)>='0' && ph.charAt(i)<='9')
				{
				}
				else
				{
					System.out.println("Entered Phone number contains Invalid Character Try again");
					phonenumber();
				}
			}
		}
		else 
		{
			System.out.println("Phone Number Contains only 10 digits and Enter again");
			phonenumber();
		}

	}//bank

	void travel()
	{
		displaymenuT();
        	orderT();

	 	System.out.println("\n	                       Do You Wish To Book One more :\n	                       	1 - "+green+"Yes"+reset+", 2 - "+red+"No"+reset);
            String again = hi.next();
            if(again.equalsIgnoreCase("YES")||again.equalsIgnoreCase("Y")||again.equals("1")) 
            {
			orderT();
			GenerateBillT();

			System.out.println("	                       *******************************************");
        			System.out.println("	                            Amount to Pay   : " +blink+TotalT+reset);
        			System.out.println("	                       *******************************************");
       			System.out.println("	                       Please select Payment method Provided below\n");
			bank1();
            } 
            else if(again.equalsIgnoreCase("NO")||again.equalsIgnoreCase("N")||again.equals("2"))
            {
                GenerateBillT();

			System.out.println("	                       *******************************************");
        			System.out.println("	                            Amount to Pay   : " +blink+TotalT+reset);
        			System.out.println("	                       *******************************************");
       			System.out.println("	                       Please select Payment method Provided below\n");
			bank1();
            }
		else
		{
			System.out.println("\nWe are considering it as no & Please Pay!");
                GenerateBillT();
			System.out.println("	                       *******************************************");
        			System.out.println("	                            Amount to Pay   : " +blink+TotalT+reset);
        			System.out.println("	                       *******************************************");
       			System.out.println("	                       Please select Payment method Provided below\n");
			bank1();
		}

	}//travel

	public void GenerateBillT() 
	{
		System.out.print(green+"Enter Your Favourite Number : "+reset);
		double p= hi.nextDouble();
		System.out.println("                                   Total amount    : " + TotalT);
		AmtT = TotalT*0.15+(p/100);
		System.out.println("                                   Discount amount : " +blue+AmtT+reset);
		TotalT = TotalT - AmtT;
		double tax = TotalT*0.05;
		System.out.println("                          Taxes total(CGST + SGST) : "+tax);
		TotalT = TotalT + tax;
	
	}//travel

	public void billT(double a)
	{
			if(TotalT == a) 
			{
            			System.out.println(blue+"	                              Payment Successful"+reset);
             			System.out.println("	                       THANK YOU.....DEAR COUPLES... "+blink+"VISIT AGAIN"+reset+".....");
			         System.out.print("	                       			"+h+reset);
        		} 
			else
			{
            		System.out.println("Transaction Failed");
           			System.out.println(red+"Please Check what you have Entered..."+reset+"& "+green+"Try Again..."+reset);
				billT(hi.nextDouble());
      		}
	}//travel

    public void displaymenuT() 
    {
        System.out.println("	                             "+Bg+bold+"WELCOME TO SOULMAKERS TRAVELS"+reset+"     ");
	try
	{
		Thread.sleep(964);
	}
	catch(Exception e){}
        System.out.println("	                       >>>>>>>>>>>>>>>>>>>>>~<<<<<<<<<<<<<<<<<<<<<");
	try
	{
		Thread.sleep(24);
	}
	catch(Exception e){}
        System.out.println("	                       *    1. "+blink+"Goa"+reset+"                        4000/- *");
	try
	{
		Thread.sleep(24);
	}
	catch(Exception e){}
        System.out.println("	                       *    2. "+blink+"Agra"+reset+"                       9000/- *");
	try
	{
		Thread.sleep(24);
	}
	catch(Exception e){}
        System.out.println("	                       *    3. Munnar                     6100/- *");
	try
	{
		Thread.sleep(24);
	}
	catch(Exception e){}
        System.out.println("	                       *    4. Singapore                 38000/- *");
	try
	{
		Thread.sleep(24);
	}
	catch(Exception e){}
        System.out.println("	                       *    5. "+blink+"Paris"+reset+"                    150000/- *");
	try
	{
		Thread.sleep(24);
	}
	catch(Exception e){}
        System.out.println("	                       *    6. Manali                     9500/- *");
	try
	{
		Thread.sleep(24);
	}
	catch(Exception e){}
        System.out.println("	                       *    7. "+blink+"Maldives"+reset+"                 150000/- *");
	try
	{
		Thread.sleep(24);
	}
	catch(Exception e){}
        System.out.println("	                       *    8. "+blink+"venice"+reset+"                   100000/- *");
	try
	{
		Thread.sleep(24);
	}
	catch(Exception e){}
        System.out.println("	                       *    9. Kanyakumari                8000/- *");
	try
	{
		Thread.sleep(964);
	}
	catch(Exception e){}
        System.out.println("	                       *    0. Exit                              *");
        System.out.println("	                       >>>>>>>>>>>>>>>>>>>>>>~<<<<<<<<<<<<<<<<<<<<\n");
	try
	{
		Thread.sleep(964);
	}
	catch(Exception e){}
        System.out.println("	                   Hello couples!!!!...Where do you wanna travel today..??");

    }//travel

    public void orderT() 
    {
		System.out.print(green+"	                   Enter Your Choice....  :  "+reset);
		XT = hi.nextInt();
		int c=0;
		for(int i = 0;i<tT.length();i++)
		{
			if(tT.charAt(i)-48==XT)
			{
				c++;
			}
		}
		
		if(c>0)
		{
			System.out.println(red+"	                       You have already visited this place Enter again!"+reset);
			orderT();
		}
	  else
	  {
		if(XT == 1)
		{
			tT = tT+XT;
			System.out.println("	                       You have selected "+blue+"Goa"+reset);
			String ST = "Goa";
			int zT=1+(int)(Math.random()*23);
			System.out.print("	                       Please wait While we confirm Your Tickets");
			for(int i = 0;i<3;i++)
			{
				try
				{
					System.out.print(".");
					Thread.sleep(500);
				}
				catch(Exception e){}
			}
			System.out.println("\n");
			System.out.println("	                       *******************************************");
    			System.out.println("	                       *	     "+Bg+bold+" Java Tickets"+reset+"               *");
			System.out.println("\n	                       	Place : "+bold+ST+reset+"\n\n	                       	Ticket count:"+red+"2"+reset+"		Timings :"+green+zT+reset+":00 \n\n	                       	Booking Id : "+"JT"+ST.length()+ST.charAt(2)+ST.charAt(ST.length()-3)+zT+"\n");
			System.out.println("	                       *******************************************");

			String a1 = "	                       * * *  ***     *   *   *  - - -  *";
			String a2 = "	                         *    *-*    *-*   * *   - -    *"; 
			String a3 = "	                         *    *  *  *   *   *    - - -  *-*-*";

			for(int i = 0;i<a1.length();i++)
			{
				System.out.print(green);
				try
				{
					System.out.print(a1.charAt(i));
					Thread.sleep(27);
				}
				catch(Exception e){}
			}
			System.out.println(reset);
			for(int i = 0;i<a2.length();i++)
			{
				System.out.print(blue);
				try
				{
					System.out.print(a2.charAt(i));
					Thread.sleep(27);
				}
				catch(Exception e){}
			}
			System.out.println(reset);
			for(int i = 0;i<a3.length();i++)
			{
				System.out.print(cyan);
				try
				{
					System.out.print(a3.charAt(i));
					Thread.sleep(27);
				}
				catch(Exception e){}
			}
			System.out.println(reset);

			System.out.println("\n	                       You are at"+blue+ST+reset);
			TotalT = TotalT + 2*Goa;
		}
		else if(XT == 2)
		{
			tT = tT+XT;
			System.out.println("	                       You have selected "+blue+"Agra"+reset);
			String ST = "Agra";
			int zT=1+(int)(Math.random()*23);
			System.out.print("	                       Please wait While we confirm Your Tickets");
			for(int i = 0;i<3;i++)
			{
				try
				{
					System.out.print(".");
					Thread.sleep(500);
				}
				catch(Exception e){}
			}
			System.out.println("\n");
			System.out.println("	                       *******************************************");
    			System.out.println("	                       *	     "+Bg+bold+" Java Tickets"+reset+"               *");
			System.out.println("\n	                       	Place : "+bold+ST+reset+"\n\n	                       	Ticket count:"+red+"2"+reset+"		Timings :"+green+zT+reset+":00 \n\n	                       	Booking Id : "+"JT"+ST.length()+ST.charAt(2)+ST.charAt(ST.length()-3)+zT+"\n");
			System.out.println("	                       *******************************************");

			String a1 = "	                       * * *  ***     *   *   *  - - -  *";
			String a2 = "	                         *    *-*    *-*   * *   - -    *"; 
			String a3 = "	                         *    *  *  *   *   *    - - -  *-*-*";

			for(int i = 0;i<a1.length();i++)
			{
				System.out.print(green);
				try
				{
					System.out.print(a1.charAt(i));
					Thread.sleep(27);
				}
				catch(Exception e){}
			}
			System.out.println(reset);
			for(int i = 0;i<a2.length();i++)
			{
				System.out.print(blue);
				try
				{
					System.out.print(a2.charAt(i));
					Thread.sleep(27);
				}
				catch(Exception e){}
			}
			System.out.println(reset);
			for(int i = 0;i<a3.length();i++)
			{
				System.out.print(cyan);
				try
				{
					System.out.print(a3.charAt(i));
					Thread.sleep(27);
				}
				catch(Exception e){}
			}
			System.out.println(reset);

			System.out.println("\n	                       You are at"+blue+ST+reset);
			TotalT = TotalT + 2*Agra;
		}
		else if(XT == 3)
		{
			tT = tT+XT;
			System.out.println("	                       You have selected "+blue+"Munnar"+reset);
			String ST = "Munnar";
			int zT=1+(int)(Math.random()*23);
			System.out.print("	                       Please wait While we confirm Your Tickets");
			for(int i = 0;i<3;i++)
			{
				try
				{
					System.out.print(".");
					Thread.sleep(500);
				}
				catch(Exception e){}
			}
			System.out.println("\n");
			System.out.println("	                       *******************************************");
    			System.out.println("	                       *	     "+Bg+bold+" Java Tickets"+reset+"               *");
			System.out.println("\n	                       	Place : "+bold+ST+reset+"\n\n	                       	Ticket count:"+red+"2"+reset+"		Timings :"+green+zT+reset+":00 \n\n	                       	Booking Id : "+"JT"+ST.length()+ST.charAt(2)+ST.charAt(ST.length()-3)+zT+"\n");
			System.out.println("	                       *******************************************");

			String a1 = "	                       * * *  ***     *   *   *  - - -  *";
			String a2 = "	                         *    *-*    *-*   * *   - -    *"; 
			String a3 = "	                         *    *  *  *   *   *    - - -  *-*-*";

			for(int i = 0;i<a1.length();i++)
			{
				System.out.print(green);
				try
				{
					System.out.print(a1.charAt(i));
					Thread.sleep(27);
				}
				catch(Exception e){}
			}
			System.out.println(reset);
			for(int i = 0;i<a2.length();i++)
			{
				System.out.print(blue);
				try
				{
					System.out.print(a2.charAt(i));
					Thread.sleep(27);
				}
				catch(Exception e){}
			}
			System.out.println(reset);
			for(int i = 0;i<a3.length();i++)
			{
				System.out.print(cyan);
				try
				{
					System.out.print(a3.charAt(i));
					Thread.sleep(27);
				}
				catch(Exception e){}
			}
			System.out.println(reset);

			System.out.println("\n	                       You are at"+blue+ST+reset);
			TotalT = TotalT + 2*Munnar;
		}
		else if(XT == 4)
		{
			tT = tT+XT;
			System.out.println("	                       You have selected "+blue+"Singapore"+reset);
			String ST = "Singapore";
			int zT=1+(int)(Math.random()*23);
			System.out.print("	                       Please wait While we confirm Your Tickets");
			for(int i = 0;i<3;i++)
			{
				try
				{
					System.out.print(".");
					Thread.sleep(500);
				}
				catch(Exception e){}
			}
			System.out.println("\n");
			System.out.println("	                       *******************************************");
    			System.out.println("	                       *	     "+Bg+bold+" Java Tickets"+reset+"               *");
			System.out.println("\n	                       	Place : "+bold+ST+reset+"\n\n	                       	Ticket count:"+red+"2"+reset+"		Timings :"+green+zT+reset+":00 \n\n	                       	Booking Id : "+"JT"+ST.length()+ST.charAt(2)+ST.charAt(ST.length()-3)+zT+"\n");
			System.out.println("	                       *******************************************");

			String a1 = "	                       * * *  ***     *   *   *  - - -  *";
			String a2 = "	                         *    *-*    *-*   * *   - -    *"; 
			String a3 = "	                         *    *  *  *   *   *    - - -  *-*-*";

			for(int i = 0;i<a1.length();i++)
			{
				System.out.print(green);
				try
				{
					System.out.print(a1.charAt(i));
					Thread.sleep(27);
				}
				catch(Exception e){}
			}
			System.out.println(reset);
			for(int i = 0;i<a2.length();i++)
			{
				System.out.print(blue);
				try
				{
					System.out.print(a2.charAt(i));
					Thread.sleep(27);
				}
				catch(Exception e){}
			}
			System.out.println(reset);
			for(int i = 0;i<a3.length();i++)
			{
				System.out.print(cyan);
				try
				{
					System.out.print(a3.charAt(i));
					Thread.sleep(27);
				}
				catch(Exception e){}
			}
			System.out.println(reset);

			System.out.println("\n	                       You are at"+blue+ST+reset);
			TotalT = TotalT + 2*Singapore;
		}
		else if(XT == 5)
		{
			tT = tT+XT;
			System.out.println("	                       You have selected "+blue+"Paris"+reset);
			String ST = "Paris";
			int zT=1+(int)(Math.random()*23);
			System.out.print("	                       Please wait While we confirm Your Tickets");
			for(int i = 0;i<3;i++)
			{
				try
				{
					System.out.print(".");
					Thread.sleep(500);
				}
				catch(Exception e){}
			}
			System.out.println("\n");
			System.out.println("	                       *******************************************");
    			System.out.println("	                       *	     "+Bg+bold+" Java Tickets"+reset+"               *");
			System.out.println("\n	                       	Place : "+bold+ST+reset+"\n\n	                       	Ticket count:"+red+"2"+reset+"		Timings :"+green+zT+reset+":00 \n\n	                       	Booking Id : "+"JT"+ST.length()+ST.charAt(2)+ST.charAt(ST.length()-3)+zT+"\n");
			System.out.println("	                       *******************************************");

			String a1 = "	                       * * *  ***     *   *   *  - - -  *";
			String a2 = "	                         *    *-*    *-*   * *   - -    *"; 
			String a3 = "	                         *    *  *  *   *   *    - - -  *-*-*";

			for(int i = 0;i<a1.length();i++)
			{
				System.out.print(green);
				try
				{
					System.out.print(a1.charAt(i));
					Thread.sleep(27);
				}
				catch(Exception e){}
			}
			System.out.println(reset);
			for(int i = 0;i<a2.length();i++)
			{
				System.out.print(blue);
				try
				{
					System.out.print(a2.charAt(i));
					Thread.sleep(27);
				}
				catch(Exception e){}
			}
			System.out.println(reset);
			for(int i = 0;i<a3.length();i++)
			{
				System.out.print(cyan);
				try
				{
					System.out.print(a3.charAt(i));
					Thread.sleep(27);
				}
				catch(Exception e){}
			}
			System.out.println(reset);

			System.out.println("\n	                       You are at"+blue+ST+reset);
			TotalT = TotalT + 2*Paris;
		}
		else if(XT == 6)
		{
			tT = tT+XT;
			System.out.println("	                       You have selected "+blue+"Manali"+reset);
			String ST = "Manali";
			int zT=1+(int)(Math.random()*23);
			System.out.print("	                       Please wait While we confirm Your Tickets");
			for(int i = 0;i<3;i++)
			{
				try
				{
					System.out.print(".");
					Thread.sleep(500);
				}
				catch(Exception e){}
			}
			System.out.println("\n");
			System.out.println("	                       *******************************************");
    			System.out.println("	                       *	     "+Bg+bold+" Java Tickets"+reset+"               *");
			System.out.println("\n	                       	Place : "+bold+ST+reset+"\n\n	                       	Ticket count:"+red+"2"+reset+"		Timings :"+green+zT+reset+":00 \n\n	                       	Booking Id : "+"JT"+ST.length()+ST.charAt(2)+ST.charAt(ST.length()-3)+zT+"\n");
			System.out.println("	                       *******************************************");

			String a1 = "	                       * * *  ***     *   *   *  - - -  *";
			String a2 = "	                         *    *-*    *-*   * *   - -    *"; 
			String a3 = "	                         *    *  *  *   *   *    - - -  *-*-*";

			for(int i = 0;i<a1.length();i++)
			{
				System.out.print(green);
				try
				{
					System.out.print(a1.charAt(i));
					Thread.sleep(27);
				}
				catch(Exception e){}
			}
			System.out.println(reset);
			for(int i = 0;i<a2.length();i++)
			{
				System.out.print(blue);
				try
				{
					System.out.print(a2.charAt(i));
					Thread.sleep(27);
				}
				catch(Exception e){}
			}
			System.out.println(reset);
			for(int i = 0;i<a3.length();i++)
			{
				System.out.print(cyan);
				try
				{
					System.out.print(a3.charAt(i));
					Thread.sleep(27);
				}
				catch(Exception e){}
			}
			System.out.println(reset);

			System.out.println("\n	                       You are at"+blue+ST+reset);
			TotalT = TotalT + 2*Manali;
		}
		else if(XT == 7)
		{
			tT = tT+XT;
			System.out.println("	                       You have selected "+blue+"Maldives"+reset);
			String ST = "Maldives";
			int zT=1+(int)(Math.random()*23);
			System.out.print("	                       Please wait While we confirm Your Tickets");
			for(int i = 0;i<3;i++)
			{
				try
				{
					System.out.print(".");
					Thread.sleep(500);
				}
				catch(Exception e){}
			}
			System.out.println("\n");
			System.out.println("	                       *******************************************");
    			System.out.println("	                       *	     "+Bg+bold+" Java Tickets"+reset+"               *");
			System.out.println("\n	                       	Place : "+bold+ST+reset+"\n\n	                       	Ticket count:"+red+"2"+reset+"		Timings :"+green+zT+reset+":00 \n\n	                       	Booking Id : "+"JT"+ST.length()+ST.charAt(2)+ST.charAt(ST.length()-3)+zT+"\n");
			System.out.println("	                       *******************************************");

			String a1 = "	                       * * *  ***     *   *   *  - - -  *";
			String a2 = "	                         *    *-*    *-*   * *   - -    *"; 
			String a3 = "	                         *    *  *  *   *   *    - - -  *-*-*";

			for(int i = 0;i<a1.length();i++)
			{
				System.out.print(green);
				try
				{
					System.out.print(a1.charAt(i));
					Thread.sleep(27);
				}
				catch(Exception e){}
			}
			System.out.println(reset);
			for(int i = 0;i<a2.length();i++)
			{
				System.out.print(blue);
				try
				{
					System.out.print(a2.charAt(i));
					Thread.sleep(27);
				}
				catch(Exception e){}
			}
			System.out.println(reset);
			for(int i = 0;i<a3.length();i++)
			{
				System.out.print(cyan);
				try
				{
					System.out.print(a3.charAt(i));
					Thread.sleep(27);
				}
				catch(Exception e){}
			}
			System.out.println(reset);

			System.out.println("\n	                       You are at"+blue+ST+reset);
			TotalT = TotalT + 2*Maldives;
		}
		else if(XT == 8)
		{
			tT = tT+XT;
			System.out.println("	                       You have selected "+blue+"Venice"+reset);
			String ST = "Venice";
			int zT=1+(int)(Math.random()*23);
			System.out.print("	                       Please wait While we confirm Your Tickets");
			for(int i = 0;i<3;i++)
			{
				try
				{
					System.out.print(".");
					Thread.sleep(500);
				}
				catch(Exception e){}
			}
			System.out.println("\n");
			System.out.println("	                       *******************************************");
    			System.out.println("	                       *	     "+Bg+bold+" Java Tickets"+reset+"               *");
			System.out.println("\n	                       	Place : "+bold+ST+reset+"\n\n	                       	Ticket count:"+red+"2"+reset+"		Timings :"+green+zT+reset+":00 \n\n	                       	Booking Id : "+"JT"+ST.length()+ST.charAt(2)+ST.charAt(ST.length()-3)+zT+"\n");
			System.out.println("	                       *******************************************");

			String a1 = "	                       * * *  ***     *   *   *  - - -  *";
			String a2 = "	                         *    *-*    *-*   * *   - -    *"; 
			String a3 = "	                         *    *  *  *   *   *    - - -  *-*-*";

			for(int i = 0;i<a1.length();i++)
			{
				System.out.print(green);
				try
				{
					System.out.print(a1.charAt(i));
					Thread.sleep(27);
				}
				catch(Exception e){}
			}
			System.out.println(reset);
			for(int i = 0;i<a2.length();i++)
			{
				System.out.print(blue);
				try
				{
					System.out.print(a2.charAt(i));
					Thread.sleep(27);
				}
				catch(Exception e){}
			}
			System.out.println(reset);
			for(int i = 0;i<a3.length();i++)
			{
				System.out.print(cyan);
				try
				{
					System.out.print(a3.charAt(i));
					Thread.sleep(27);
				}
				catch(Exception e){}
			}
			System.out.println(reset);

			System.out.println("\n	                       You are at"+blue+ST+reset);
			TotalT = TotalT + 2*Venice;
		}
		else if(XT == 9)
		{
			tT = tT+XT;
			System.out.println("	                       You have selected "+blue+"Kanyakumari"+reset);
			String ST = "Kanyakumari";
			int zT=1+(int)(Math.random()*23);
			System.out.print("	                       Please wait While we confirm Your Tickets");
			for(int i = 0;i<3;i++)
			{
				try
				{
					System.out.print(".");
					Thread.sleep(500);
				}
				catch(Exception e){}
			}

			System.out.println("\n");
			System.out.println("	                       *******************************************");
    			System.out.println("	                       *	     "+Bg+bold+" Java Tickets"+reset+"               *");
			System.out.println("\n	                       	Place : "+bold+ST+reset+"\n\n	                       	Ticket count:"+red+"2"+reset+"		Timings :"+green+zT+reset+":00 \n\n	                       	Booking Id : "+"JT"+ST.length()+ST.charAt(2)+ST.charAt(ST.length()-3)+zT+"\n");
			System.out.println("	                       *******************************************");

			String a1 = "	                       * * *  ***     *   *   *  - - -  *";
			String a2 = "	                         *    *-*    *-*   * *   - -    *"; 
			String a3 = "	                         *    *  *  *   *   *    - - -  *-*-*";

			for(int i = 0;i<a1.length();i++)
			{
				System.out.print(green);
				try
				{
					System.out.print(a1.charAt(i));
					Thread.sleep(27);
				}
				catch(Exception e){}
			}
			System.out.println(reset);
			for(int i = 0;i<a2.length();i++)
			{
				System.out.print(blue);
				try
				{
					System.out.print(a2.charAt(i));
					Thread.sleep(27);
				}
				catch(Exception e){}
			}
			System.out.println(reset);
			for(int i = 0;i<a3.length();i++)
			{
				System.out.print(cyan);
				try
				{
					System.out.print(a3.charAt(i));
					Thread.sleep(27);
				}
				catch(Exception e){}
			}
			System.out.println(reset);

			System.out.println("\n	                       You are at"+blue+ST+reset);
			TotalT = TotalT + 2*Kanyakumari;
		}
		else if(XT == 0)
		{	
		}
		else
		{
			System.out.println(red+"You have entered wrong choice "+blink+"Try again"+reset);
			orderT();
		}
	}
	 
    }//travel
	
}