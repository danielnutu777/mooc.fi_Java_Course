package partOne.Ex13;

import nhlstats.NHLStatistics;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception{
        Scanner reader = new Scanner(System.in);

        System.out.println("Top ten by goals: ");
        NHLStatistics.sortByGoals();
        NHLStatistics.top(10);
        System.out.println();


        System.out.println("Top 25 by penalties");
        NHLStatistics.sortByPenalties();
        NHLStatistics.top(25);

        System.out.println("Statistics for Sidney Crosby: ");
        NHLStatistics.searchByPlayer("Sidney Crosby");

        System.out.println("Statistics for Philadelphia Flyers");
        NHLStatistics.teamStatistics("PHI");
        NHLStatistics.sortByPoints();

        System.out.println("Players in Anaheim Ducks: ");
        NHLStatistics.teamStatistics("ANA");
        NHLStatistics.sortByPoints();

    }
}