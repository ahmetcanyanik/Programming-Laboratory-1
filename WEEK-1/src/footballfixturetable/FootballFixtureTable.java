package footballfixturetable;

import java.util.Scanner;

public class FootballFixtureTable {

    public static void main(String[] args) {
        int Ap=0;
        int Bp=0;
        int Cp=0;
        int Dp=0;

        int Aav=0;
        int Bav=0;
        int Cav=0;
        int Dav=0;

        int Awin=0;
        int Bwin=0;
        int Cwin=0;
        int Dwin=0;
        
        int Alos=0;
        int Blos=0;
        int Clos=0;
        int Dlos=0;
        
        int Adr=0;
        int Bdr=0;
        int Cdr=0;
        int Ddr=0;

        System.out.println("--- All Matches ---");
        System.out.println("Match 1: Team A vs Team B");
        System.out.println("Match 2: Team A vs Team C");
        System.out.println("Match 3: Team A vs Team D");
        System.out.println("Match 4: Team B vs Team C");
        System.out.println("Match 5: Team B vs Team D");
        System.out.println("Match 6: Team C vs Team D");
        System.out.println("");
        
        Scanner a = new Scanner(System.in);
        
        System.out.print("Please write first match's scores: ");
        int m1a = a.nextInt();
        int m1b = a.nextInt();
        if (m1a>m1b) {
            Ap+=3;
            Awin+=1;
            Aav+=(m1a-m1b);
            Blos+=1;
        }else if (m1a<m1b) {
            Bp+=3;
            Bwin+=1;
            Bav+=(m1b-m1a);
            Alos+=1;
        }else{
            Ap+=1;
            Bp+=1;
            Adr+=1;
            Bdr+=1;
        }
        
        System.out.println("First match: Team A:" + m1a + " Team B:" + m1b);
        
        System.out.println("");
        
        System.out.println("Please write second match's scores: ");
        int m2a = a.nextInt();
        int m2c = a.nextInt();
        if (m2a>m2c) {
            Ap+=3;
            Awin+=1;
            Aav+=(m2a-m2c);
            Clos+=1;
        }else if (m2a<m2c) {
            Cp+=3;
            Cwin+=1;
            Cav+=(m2c-m2a);
            Alos+=1;
        }else if (m2a==m2c) {
            Ap+=1;
            Cp+=1;
            Adr+=1;
            Cdr+=1;
        }
        System.out.println("Second match: Team A:" + m2a + " Team C:" + m2c);
        
        System.out.println("");
        
        System.out.println("Please third match's scores: ");
        int m3a = a.nextInt();
        int m3d = a.nextInt();
        if (m3a>m3d) {
            Ap+=3;
            Awin+=1;
            Aav+=(m3a-m3d);
            Dlos+=1;
        }else if (m3a<m3d) {
            Dp+=3;
            Dwin+=1;
            Dav+=(m3d-m3a);
            Alos+=1;
        }else if (m3a==m3d) {
            Ap+=1;
            Dp+=1;
            Adr+=1;
            Ddr+=1;
        }
        System.out.println("Third match: Team A:" + m3a + " Team D:" + m3d);
        
        System.out.println("");
        
        System.out.println("Please write fourth match's scores: ");
        int m4b = a.nextInt();
        int m4c = a.nextInt();
        if (m4b>m4c) {
            Bp+=3;
            Bwin+=1;
            Bav+=(m4b-m4c);
            Clos+=1;
        }else if (m4b<m4c) {
            Cp+=3;
            Cwin+=1;
            Cav+=(m4c-m4b);
            Blos+=1;
        }else if (m4b==m4c) {
            Bp+=1;
            Cp+=1;
            Bdr+=1;
            Cdr+=1;
        }
        System.out.println("Fourth match: Team B:" + m4b + " Team C:" + m4c);
        
        System.out.println("");
        
        System.out.println("Please write fifth match's scores: ");
        int m5b = a.nextInt();
        int m5d = a.nextInt();
        if (m5b>m5d) {
            Bp+=3;
            Bwin+=1;
            Bav+=(m5b-m5d);
            Dlos+=1;
        }else if (m5b<m5d) {
            Dp+=3;
            Dwin+=1;
            Dav+=(m5d-m5b);
            Blos+=1;
        }else if (m5b==m5d) {
            Bp+=1;
            Dp+=1;
            Bdr+=1;
            Ddr+=1;
        }
        System.out.println("Fifth match: Team B:" + m5b + " Team D:" + m5d);
        
        System.out.println("");
        
        System.out.println("Please write sixth match's scores: ");
        int m6c = a.nextInt();
        int m6d = a.nextInt();
        if (m6c>m6d) {
            Cp+=3;
            Cwin+=1;
            Cav+=(m6c-m6d);
            Dlos+=1;
        }else if (m6c<m6d) {
            Dp+=3;
            Dwin+=1;
            Dav+=(m6d-m6c);
            Clos+=1;
        }else if (m6c==m6d) {
            Cp+=1;
            Dp+=1;
            Cdr+=1;
            Ddr+=1;
        }
        System.out.println("Sixth match: Team C:" + m6c + " Team D:" + m6d);
        
        System.out.println("");
        
        System.out.println("------ FINAL TABLE ------");
        System.out.println("-------------------------");
        System.out.println("Team A info: MatchesPlayed:3" + " Wins:" + Awin + " Draws:" + Adr + " Loses:" + Alos + " Points:" + Ap + " GoalDiff:" + Aav);
        System.out.println("-------------------------");
        System.out.println("Team B info: MatchesPlayed:3" + " Wins:" + Bwin + " Draws:" + Bdr + " Loses:" + Blos + " Points:" + Bp + " GoalDiff:" + Bav);
        System.out.println("-------------------------");
        System.out.println("Team C info: MatchesPlayed:3" + " Wins:" + Cwin + " Draws:" + Cdr + " Loses:" + Clos + " Points:" + Cp + " GoalDiff:" + Cav);
        System.out.println("-------------------------");
        System.out.println("Team D info: MatchesPlayed:3" + " Wins:" + Dwin + " Draws:" + Ddr + " Loses:" + Dlos + " Points:" + Dp + " GoalDiff:" + Dav);
        System.out.println("-------------------------");
        
        int[] maxPoint = new int[4];
        maxPoint[0] = Ap;
        maxPoint[1] = Bp;
        maxPoint[2] = Cp;
        maxPoint[3] = Dp;
        int highPoint = maxPoint[0];

        int[] gd = new int[4];
        gd[0] = Aav;
        gd[1] = Bav;
        gd[2] = Cav;
        gd[3] = Dav;
        int goalDiff = gd[0];

        String[] names = new String[4];
        names[0] = "TEAM A";
        names[1] = "TEAM B";
        names[2] = "TEAM C";
        names[3] = "TEAM D";
        String champ = names[0];

        for (int k = 1; k < 4; k++) {
            if (maxPoint[k] > highPoint) {
                champ = names[k];
                highPoint = maxPoint[k];
                goalDiff = gd[k];
            } else if (maxPoint[k] == highPoint) {
                if (gd[k] > goalDiff) {
                    champ = names[k];
                    goalDiff = gd[k];
                }
            }
        }

        System.out.println("CHAMPION " + champ);
    }
}
