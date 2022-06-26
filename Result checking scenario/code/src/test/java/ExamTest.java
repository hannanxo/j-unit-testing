import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ExamTest {
    Exam e;

    @BeforeEach
    public void init()
    {
        e = new Exam();
    }
    @Test
    void test()
    {
        int c0 = e.Evaluation(new int[]{1, 1, 1, 1, 1, 1, 1, 1, 1, 1});
        Assertions.assertEquals(c0, 10 );
    }
    @Test
    void test1(){
        int c1 = e.Evaluation(new int[]{1, 1, 1, 1, 1, 1, 1, 1, 1, 2});
        Assertions.assertEquals(c1, 9 );
    }
    @Test
    void test2(){
        int c2 = e.Evaluation(new int[]{1, 1, 1, 1, 1, 1, 1, 1, 2, 2});
        Assertions.assertEquals(c2, 8 );
    }
    @Test
    void test3(){
        int c3 = e.Evaluation(new int[]{1, 1, 1, 1, 1, 1, 1, 2, 2, 2});
        Assertions.assertEquals(c3, 7);
    }
    @Test
    void test4(){
        int c4 = e.Evaluation(new int[]{1, 1, 1, 1, 1, 1, 2, 2, 2, 2});
        Assertions.assertEquals(c4, 6);
    }
    @Test
    void test5(){
        int c5 = e.Evaluation(new int[]{1, 1, 1, 1, 1, 2, 2, 2, 2, 2});
        Assertions.assertEquals(c5, 5 );
    }
    @Test
    void test6(){
        int c6 = e.Evaluation(new int[]{1, 1, 1, 1, 2, 2, 2, 2, 2, 2});
        Assertions.assertEquals(c6, 4 );
    }
    @Test
    void test7(){
        int c7 = e.Evaluation(new int[]{1, 1, 1, 2, 2, 2, 2, 2, 2, 2});
        Assertions.assertEquals(c7, 3 );
    }
    @Test
    void test8(){
        int c8 = e.Evaluation(new int[]{1, 1, 2, 2, 2, 2, 2, 2, 2, 2});
        Assertions.assertEquals(c8, 2 );
    }
    @Test
    void test9(){
        int c9 = e.Evaluation(new int[]{1, 2, 2, 2, 2, 2, 2, 2, 2, 2});
        Assertions.assertEquals(c9, 1 );
    }
    @Test
    void test10(){
        int c10 = e.Evaluation(new int[]{2, 2, 2, 2, 2, 2, 2, 2, 2, 2});
        Assertions.assertEquals(c10, 0 );
    }
}
