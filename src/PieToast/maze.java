package PieToast;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class maze {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(new File("C:/Users/user/coditum/git/coditum-fall/src/PieToast/theemaze"));
		String isthisthemaze[][]=new String[scan.nextInt()][scan.nextInt()];
		String line=scan.nextLine();
		System.out.println(line);
		for(int thismightbethemazelength=0; thismightbethemazelength<(isthisthemaze.length); thismightbethemazelength++) {
			String[] whatifthelinewasanarray = isthisthemaze[thismightbethemazelength];
			line=scan.nextLine();
			for(int turnthelineintobrackets=0; turnthelineintobrackets<(isthisthemaze[0].length); turnthelineintobrackets++) {
				String nottheline=line;
				whatifthelinewasanarray[turnthelineintobrackets]=Character.toString(nottheline.charAt(turnthelineintobrackets));
			}

			isthisthemaze[thismightbethemazelength]=whatifthelinewasanarray;
		}
		printMaze(isthisthemaze);
		solvethemazeof(isthisthemaze);
	}
	public static void solvethemazeof(String examplemazegoeshere[][]) {
		String alinefromamaze[];
		int thecurrentcolumn=0;
		int beingdone = 0;
		int yesfinallythefinalthingihope = 0;
		for(int lookingfors=0; lookingfors<examplemazegoeshere.length; lookingfors++){
			String thelinefromthemaze="";
			alinefromamaze=examplemazegoeshere[lookingfors];
			for(int transferringaline=0; transferringaline<alinefromamaze.length; transferringaline++) {
				thelinefromthemaze=thelinefromthemaze+""+alinefromamaze[transferringaline];

			}
			System.out.println(thelinefromthemaze);
			if (thelinefromthemaze.contains("S")) {
				thecurrentcolumn=thelinefromthemaze.indexOf("S");
				yesfinallythefinalthingihope=thecurrentcolumn;
				beingdone=lookingfors;

			}
		}
		System.out.println(beingdone+","+yesfinallythefinalthingihope);

		boolean solved=false;
		int theintthatmakesthejstaytwice=0;
		while(solved==false) {

			//	printMaze(examplemazegoeshere);
			//	System.out.println(beingdone+","+yesfinallythefinalthingihope);
			if(examplemazegoeshere[beingdone][yesfinallythefinalthingihope+1].equals(" ")||examplemazegoeshere[beingdone][yesfinallythefinalthingihope+1].equals("E")) {
				examplemazegoeshere[beingdone][yesfinallythefinalthingihope]="j";
				yesfinallythefinalthingihope=yesfinallythefinalthingihope+1;
				printMaze(examplemazegoeshere);
			}else if(examplemazegoeshere[beingdone+1][yesfinallythefinalthingihope].equals(" ")||examplemazegoeshere[beingdone+1][yesfinallythefinalthingihope].equals("E")){
				examplemazegoeshere[beingdone][yesfinallythefinalthingihope]="j";
				beingdone=beingdone+1;
				printMaze(examplemazegoeshere);
			}else if(examplemazegoeshere[beingdone][yesfinallythefinalthingihope-1].equals(" ")||examplemazegoeshere[beingdone][yesfinallythefinalthingihope-1].equals("E")) {
				examplemazegoeshere[beingdone][yesfinallythefinalthingihope]="j";
				yesfinallythefinalthingihope=yesfinallythefinalthingihope-1;
				printMaze(examplemazegoeshere);
			}else if(examplemazegoeshere[beingdone-1][yesfinallythefinalthingihope].equals(" ")||examplemazegoeshere[beingdone-1][yesfinallythefinalthingihope].equals("E")) {
				examplemazegoeshere[beingdone][yesfinallythefinalthingihope]="j";

				beingdone=beingdone-1;
				printMaze(examplemazegoeshere);
			}else {
				if(examplemazegoeshere[beingdone][yesfinallythefinalthingihope+1].equals("j")) {
					examplemazegoeshere[beingdone][yesfinallythefinalthingihope]="r";
					yesfinallythefinalthingihope=yesfinallythefinalthingihope+1;
					printMaze(examplemazegoeshere);
				}else if(examplemazegoeshere[beingdone+1][yesfinallythefinalthingihope].equals("j")){
					examplemazegoeshere[beingdone][yesfinallythefinalthingihope]="r";
					beingdone=beingdone+1;
					printMaze(examplemazegoeshere);
				}else if(examplemazegoeshere[beingdone][yesfinallythefinalthingihope-1].equals("j")) {
					examplemazegoeshere[beingdone][yesfinallythefinalthingihope]="r";
					yesfinallythefinalthingihope=yesfinallythefinalthingihope-1;
					printMaze(examplemazegoeshere);
				}else if(examplemazegoeshere[beingdone-1][yesfinallythefinalthingihope].equals("j")) {
					examplemazegoeshere[beingdone][yesfinallythefinalthingihope]="r";
					beingdone=beingdone-1;
					printMaze(examplemazegoeshere);
				}else {
					if(examplemazegoeshere[beingdone][yesfinallythefinalthingihope+1].equals("u")) {
						examplemazegoeshere[beingdone][yesfinallythefinalthingihope]="r";
						yesfinallythefinalthingihope=yesfinallythefinalthingihope+1;
						printMaze(examplemazegoeshere);
					}else if(examplemazegoeshere[beingdone+1][yesfinallythefinalthingihope].equals("u")){
						examplemazegoeshere[beingdone][yesfinallythefinalthingihope]="r";
						beingdone=beingdone+1;
						printMaze(examplemazegoeshere);
					}else if(examplemazegoeshere[beingdone][yesfinallythefinalthingihope-1].equals("u")) {
						examplemazegoeshere[beingdone][yesfinallythefinalthingihope]="r";
						yesfinallythefinalthingihope=yesfinallythefinalthingihope-1;
						printMaze(examplemazegoeshere);
					}else if(examplemazegoeshere[beingdone-1][yesfinallythefinalthingihope].equals("u")) {
						examplemazegoeshere[beingdone][yesfinallythefinalthingihope]="r";
						beingdone=beingdone-1;
						printMaze(examplemazegoeshere);
					}
				}
			}
			theintthatmakesthejstaytwice=theintthatmakesthejstaytwice+1;
			String alinefromamazebutitsj[];
			int thecurrentcolumnbutitsj=0;
			int beingdonebutitsj = 0;
			if(theintthatmakesthejstaytwice==2) {
				int yesfinallythefinalthingihopebutitsj = 0;
				for(int lookingforj=0; lookingforj<examplemazegoeshere.length; lookingforj++){
					String thelinefromthemazebutitsj="";
					alinefromamazebutitsj=examplemazegoeshere[lookingforj];
					for(int transferringalinebutitsj=0; transferringalinebutitsj<alinefromamazebutitsj.length; transferringalinebutitsj++) {
						thelinefromthemazebutitsj=thelinefromthemazebutitsj+""+alinefromamazebutitsj[transferringalinebutitsj];

					}
					if (thelinefromthemazebutitsj.contains("j")) {
						thecurrentcolumnbutitsj=thelinefromthemazebutitsj.indexOf("j");
						yesfinallythefinalthingihopebutitsj=thecurrentcolumnbutitsj;
						beingdonebutitsj=lookingforj;
					}
				}
				examplemazegoeshere[beingdonebutitsj][yesfinallythefinalthingihopebutitsj]="u";
				theintthatmakesthejstaytwice=0;
			}
			if(examplemazegoeshere[beingdone][yesfinallythefinalthingihope].equals("E")) {
				System.out.println("e");
				printMaze(examplemazegoeshere);
				solved=true;
			}else {
				solved=false;
			}
		}
	}

	public static void printMaze(String[][] isthisthemaze) {
		for(int e=0; e<7; e++) {
			for(int r=0; r<7; r++){
				System.out.print(isthisthemaze[e][r]);
			}
			System.out.println("");
		}
	}
}
