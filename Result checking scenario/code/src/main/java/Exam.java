public class Exam {
     int Evaluation(int[]arr)
    {
        int passed = 0;
        int failed = 0;
        int currentStudent = 0;
        while(currentStudent < 10)
        {
            if(arr[currentStudent] == 1)
            {
                passed = passed + 1;
            }

            else
            {
                failed = failed + 1;
            }
            currentStudent = currentStudent + 1;
        }
        if(passed > 8)
        {
            System.out.println("Bonus to instructor");
        }
        return passed;
    }
}
