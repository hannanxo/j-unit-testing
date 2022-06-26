public class Feature {
    int CarInsurance (int age, char gender, Boolean married, int points)
    {
        int Premium = 500;
        if ((age<25) && (gender =='M') && (!married))
        {
            Premium += 1500;
        }
        else
        {
            if (married || gender == 'F')
            {
                Premium -= 200;
            }


            if ((age>45) && (age<65))
            {
                Premium -= 100;
            }
        }
        if (points > 5)
            { points = 5; }
        Premium = Premium + points * 20;
        return Premium;
    }
}
