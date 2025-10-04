import java.util.ArrayList;
import java.util.Collections;

public class JobSequencingProblem {
    static class Job {
        int id;
        int profit;
        int deadline;

        public Job(int i, int p, int d) {
            id = i;
            profit = p;
            deadline = d;
        }
    }
    public static void main(String[] args) {
        Integer jobsInfo[][] = { { 4, 20 }, { 1, 10 }, { 1, 40 }, { 1, 30 } };

        ArrayList<Job> jobs = new ArrayList<>();
        for (int i = 0; i < jobsInfo.length; i++) {
            jobs.add(new Job(i, jobsInfo[i][1], jobsInfo[i][0]));
        }

        Collections.sort(jobs, (obj1, obj2) -> obj2.profit - obj1.profit);

        ArrayList<Integer> seq = new ArrayList<>();

        int time = 0;
        for (int i = 0; i < jobs.size(); i++) {
            Job curr = jobs.get(i);
            if (curr.deadline > time) {
                seq.add(i);
                time += 1;
            }
        }

        System.out.println("The total jobs we can perform is : " + seq.size());
        for (int i = 0; i < seq.size(); i++) {
            System.out.print(seq.get(i) + " ");
        }

        System.out.println();
    }
}
