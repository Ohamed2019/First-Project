import java.util.Scanner;
public class SecondJuniorHighSchool {
    // 3Tests + Integrated Activities
    public static double First(double FirstTest,double SecondTest,double ThirdTest,double IntegratedActivities)
    {
        return (((FirstTest+SecondTest+ThirdTest)/3)*3)/4+(IntegratedActivities/4);
    }
    //3 Tests 
    public static double Second(double FirstTest,double SecondTest,double ThirdTest)
    {
        return (FirstTest+SecondTest+ThirdTest)/3;
    }
    //2 Tests + Integrated Activities
    public static double Third(double FirstTest,double SecondTest,double IntegratedActivities)
    {
        return (((FirstTest+SecondTest)/2)*3)/4+(IntegratedActivities/4);
    }
    //4 Tests + Integrated Activities
    public static double Forth(double FirstTest,double SecondTest,double ThirdTest,double ForthTest,double IntegratedActivities)
    {
        return(((FirstTest+SecondTest+ThirdTest+ForthTest)/4)*3)/4+(IntegratedActivities/4);
    }

    //Showing Functions
    //3Tests + Integrated Activities
    public static void AffishingFirst (double[] array , double matiere)
    {
        for(int i=0;i<array.length;i++)
        {
            if(i==0)
            {
                System.out.print("The point of first Test is: "+array[i]);
            }
            else if(i==1)
            {
                System.out.print("\nThe point of second Test is: "+array[i]);
            }
            else if(i==2)
            {
                System.out.print("\nThe point of Third Test is: "+array[i]);
            }
            else if(i==array.length-1)
            {
                System.out.print("\nThe point of Integrated Activities is: "+array[i]);
            }
        }
            System.out.print("\nYour note is : "+matiere);
        }

        //3 Tests
        public static void AffishingSecond(double[] array,double matiere)
        {
            for(int i=0;i<array.length;i++)
            {
                if(i==0)
                {
                    System.out.print("The point of first Test is: "+array[i]);
                }
                else if(i==1)
                {
                    System.out.print("\nThe point of second Test is: "+array[i]);
                }
                else if(i==2)
                {
                    System.out.print("\nThe point of Third Test is: "+array[i]);
                }
            }
            System.out.print("\nYour note is : "+matiere);
        }
        //2 Tests + Integrated Activities
        public static void AffishingThird(double []array,double matiere)
        {
            for(int i=0;i<array.length;i++)
            {
                if(i==0)
                {
                    System.out.print("The point of first Test is: "+array[i]);
                }
                else if(i==1)
                {
                    System.out.print("\nThe point of second Test is: "+array[i]);
                }
                else if(i==2)
                {
                    System.out.print("\nThe point of Integrated Activities is: "+array[i]);
                }
            }
            System.out.print("\nYour note is : "+matiere);
        }

        //4 Tests + Integrated Activities
        public static void AffishingForth(double[] array , double matiere)
        {
            for(int i=0;i<array.length;i++)
            {
                if(i==0)
                {
                    System.out.print("\nThe point of first Test is: "+array[i]);
                }
                else if(i==1)
                {
                    System.out.print("\nThe point of second Test is: "+array[i]);
                }
                else if(i==2)
                {
                    System.out.print("\nThe point of Integrated Activities is: "+array[i]);
                }
                else if(i==3)
                {
                    System.out.print("\nThe point of Integrated Activities is: "+array[i]);
                }
                else if(i==array.length-1)
                {
                    System.out.print("\nThe point of Integrated Activities is: "+array[i]);
                }
            }
            System.out.print("\nYour note is : "+matiere);
        }
        public static void main(String[]args){
        /*
        في هذا المشروع سنصنع برنامجا نقوم بإعطائه نقط التي حصلنا عليها ؛ بالطبع النقط المحصل عليها بين 0 و20؛
        بعد ذلك يقوم بعرض النقط المحصل عليها والمعدل لكل مادة على حدة
        */
        Scanner input=new Scanner(System.in);
        double EducationPhysiqueFirstSession;
        double HistoireGeographieFirstSession;
        double InformatiqueFirstSession;
        double InstructionIslamiqueFirstSession;
        double LangueArabeFirstSession;
        double LangueFrancaiseFirstSession;
        double MathematiquesFirstSession;
        double PhysiqueChimieFirstSession;
        double SciencesDeLaVieEtDeLaTerreFirstSession;
        double AssiduiteEtConduiteFirstSession;
        double CycleRateFirstSession;
        System.out.print("The educational cirriculum of Morroco consists of 9 subjects, namely: ");
        System.out.print("\nEducation Physique");
        System.out.print("\nHISTOIRE GEOGRAPHIE");
        System.out.print("\nINFORMATIQUE");
        System.out.print("\nINSTRUCTION ISLAMIQUE");
        System.out.print("\nLANGUE ARABE");
        System.out.print("\nLANGUE FRANCAISE");
        System.out.print("\nMATHEMATIQUES");
        System.out.print("\nPHYSIQUE CHIMIE");
        System.out.print("\nSC. DE LA VIE ET DE LA TERRE");
        //Entering Points of First Session
        System.out.print("Now, Start Entering your points of the first session: ");
        //Education Physique
        System.out.print("\nEducation Physique\n---------\n---------\n");
        double FirstTestEducationPhysiqueFirstSession;
        do
        {
            System.out.print("Enter the point of the first test: ");
            FirstTestEducationPhysiqueFirstSession=input.nextDouble();
        }
        while(FirstTestEducationPhysiqueFirstSession<0||FirstTestEducationPhysiqueFirstSession>20);
        double SecondTestEducationPhysiqueFirstSession;
        do
        {
            System.out.print("Enter the point of the Second test: ");
            SecondTestEducationPhysiqueFirstSession=input.nextDouble();
        }
        while(SecondTestEducationPhysiqueFirstSession<0||SecondTestEducationPhysiqueFirstSession>20);
        double ThirdTestEducationPhysiqueFirstSession;
        do
        {
            System.out.print("Enter the point of the Third test: ");
            ThirdTestEducationPhysiqueFirstSession=input.nextDouble();
        }
        while(ThirdTestEducationPhysiqueFirstSession<0||ThirdTestEducationPhysiqueFirstSession>20);
        EducationPhysiqueFirstSession=Second(FirstTestEducationPhysiqueFirstSession,SecondTestEducationPhysiqueFirstSession,ThirdTestEducationPhysiqueFirstSession);
        double[] EducationPhysiqueFirstSessionPoints={FirstTestEducationPhysiqueFirstSession,SecondTestEducationPhysiqueFirstSession,ThirdTestEducationPhysiqueFirstSession};

        //HistoireGeographie
        System.out.print("\nHistoire Geographie\n---------\n---------\n");
        double FirstTestHistoireGeographieFirstSession;
        do
        {
            System.out.print("Enter the point of the first test: ");
            FirstTestHistoireGeographieFirstSession=input.nextDouble();
        }
        while(FirstTestHistoireGeographieFirstSession<0||FirstTestHistoireGeographieFirstSession>20);
        double SecondTestHistoireGeographieFirstSession;
        do
        {
            System.out.print("Enter the point of the third test: ");
            SecondTestHistoireGeographieFirstSession=input.nextDouble();
        }
        while(SecondTestHistoireGeographieFirstSession<0||SecondTestHistoireGeographieFirstSession>20);
        double ThirdTestHistoireGeographieFirstSession;
        do
        {
            System.out.print("Enter the point of the Second test: ");
            ThirdTestHistoireGeographieFirstSession=input.nextDouble();
        }
        while(ThirdTestHistoireGeographieFirstSession<0||ThirdTestHistoireGeographieFirstSession>20);
        double IntegratedActivitiesHistoireGeographieFirstSession;
        do
        {
            System.out.print("Enter the point of the Integrated Activities: ");
            IntegratedActivitiesHistoireGeographieFirstSession=input.nextDouble();
        }
        while(IntegratedActivitiesHistoireGeographieFirstSession<0||IntegratedActivitiesHistoireGeographieFirstSession>20);
        HistoireGeographieFirstSession=First(FirstTestHistoireGeographieFirstSession,SecondTestHistoireGeographieFirstSession,ThirdTestHistoireGeographieFirstSession,IntegratedActivitiesHistoireGeographieFirstSession);
        double[] HistoireGeographieFirstSessionPoints={FirstTestHistoireGeographieFirstSession,SecondTestHistoireGeographieFirstSession,ThirdTestHistoireGeographieFirstSession,IntegratedActivitiesHistoireGeographieFirstSession};


        //INFORMATIQUE
        System.out.print("\nINFORMATIQUE\n---------\n---------\n");
        double FirstTestINFORMATIQUEFirstSession;
        do
        {
            System.out.print("Enter the point of the first test: ");
            FirstTestINFORMATIQUEFirstSession=input.nextDouble();
        }
        while(FirstTestINFORMATIQUEFirstSession<0||FirstTestINFORMATIQUEFirstSession>20);
        double SecondTestINFORMATIQUEFirstSession;
        do
        {
            System.out.print("Enter the point of the Second test: ");
            SecondTestINFORMATIQUEFirstSession=input.nextDouble();
        }
        while(SecondTestINFORMATIQUEFirstSession<0||SecondTestINFORMATIQUEFirstSession>20);
        double ThirdTestINFORMATIQUEFirstSession;
        do
        {
            System.out.print("Enter the point of the third test: ");
            ThirdTestINFORMATIQUEFirstSession=input.nextDouble();
        } 
        while(ThirdTestINFORMATIQUEFirstSession<0||ThirdTestINFORMATIQUEFirstSession>20);
        double IntegratedActivitiesINFORMATIQUEFirstSession;
        do
        {
            System.out.print("Enter the point of the Integrated Activities: ");
            IntegratedActivitiesINFORMATIQUEFirstSession=input.nextDouble();
        }
        while(IntegratedActivitiesINFORMATIQUEFirstSession<0||IntegratedActivitiesINFORMATIQUEFirstSession>20);
        InformatiqueFirstSession=First(FirstTestINFORMATIQUEFirstSession,SecondTestINFORMATIQUEFirstSession,ThirdTestINFORMATIQUEFirstSession,IntegratedActivitiesINFORMATIQUEFirstSession);
        double[] INFORMATIQUEFirstSessionPoints={FirstTestINFORMATIQUEFirstSession,SecondTestINFORMATIQUEFirstSession,ThirdTestINFORMATIQUEFirstSession,IntegratedActivitiesINFORMATIQUEFirstSession};

        //INSTRUCTION ISLAMIQUE
        System.out.print("\nINSTRUCTION ISLAMIQUE \n---------\n---------\n");
        double FirstTestInstructionIslamiqueFirstSession;
        do
        {
            System.out.print("Enter the point of the first test: ");
            FirstTestInstructionIslamiqueFirstSession=input.nextDouble();
            }
            while(FirstTestInstructionIslamiqueFirstSession<0||FirstTestInstructionIslamiqueFirstSession>20);
            double SecondTestInstructionIslamiqueFirstSession;
            do
            {
                System.out.print("Enter the point of the Second test: ");
                SecondTestInstructionIslamiqueFirstSession=input.nextDouble();
            }
            while(SecondTestInstructionIslamiqueFirstSession<0||SecondTestInstructionIslamiqueFirstSession>20);
            double IntegratedActivitiesInstructionIslamiqueFirstSession;
            do
            {
                System.out.print("Enter the point of the Integrated Activities: ");
                IntegratedActivitiesInstructionIslamiqueFirstSession=input.nextDouble();
            }
            while(IntegratedActivitiesInstructionIslamiqueFirstSession<0||IntegratedActivitiesInstructionIslamiqueFirstSession>20);
            InstructionIslamiqueFirstSession=Third(FirstTestInstructionIslamiqueFirstSession,SecondTestInstructionIslamiqueFirstSession,IntegratedActivitiesInstructionIslamiqueFirstSession);
            double[] InstructionIslamiqueFirstSessionPoints={FirstTestInstructionIslamiqueFirstSession,SecondTestInstructionIslamiqueFirstSession,IntegratedActivitiesInstructionIslamiqueFirstSession};


            //LANGUE ARABE
            System.out.print("\nLANGUE ARABE \n---------\n---------\n");
            double FirstTestLangueArabeFirstSession;
            do
            {
                System.out.print("Enter the point of the first test: ");
                FirstTestLangueArabeFirstSession=input.nextDouble();
            }
            while(FirstTestLangueArabeFirstSession<0||FirstTestLangueArabeFirstSession>20);
            double SecondTestLangueArabeFirstSession;
            do
            {
                System.out.print("Enter the point of the Second test: ");
                SecondTestLangueArabeFirstSession=input.nextDouble();
            }
            while(SecondTestLangueArabeFirstSession<0||SecondTestLangueArabeFirstSession>20);
            double IntegratedActivitiesLangueArabeFirstSession;
            do
            {
                System.out.print("Enter the point of the Integrated Activities: ");
                IntegratedActivitiesLangueArabeFirstSession=input.nextDouble();
            }
            while(IntegratedActivitiesLangueArabeFirstSession<0||IntegratedActivitiesLangueArabeFirstSession>20);
            LangueArabeFirstSession=Third(FirstTestLangueArabeFirstSession,SecondTestLangueArabeFirstSession,IntegratedActivitiesLangueArabeFirstSession);
            double[] LangueArabeFirstSessionPoints={FirstTestLangueArabeFirstSession,SecondTestLangueArabeFirstSession,IntegratedActivitiesLangueArabeFirstSession};

            //SC. DE LA VIE ET DE LA TERRE
            System.out.print("\nSC. DE LA VIE ET DE LA TERRE \n---------\n---------\n");
            double FirstTestSciencesDeLaVieEtDeLaTerreFirstSession;
            do
            {
                System.out.print("Enter the point of the first test: ");
                FirstTestSciencesDeLaVieEtDeLaTerreFirstSession=input.nextDouble();
            }
            while(FirstTestSciencesDeLaVieEtDeLaTerreFirstSession<0||FirstTestSciencesDeLaVieEtDeLaTerreFirstSession>20);
            double SecondTestSciencesDeLaVieEtDeLaTerreFirstSession;
            do
            {
                System.out.print("Enter the point of the Second test: ");
                SecondTestSciencesDeLaVieEtDeLaTerreFirstSession=input.nextDouble();
            }
            while(SecondTestSciencesDeLaVieEtDeLaTerreFirstSession<0||SecondTestSciencesDeLaVieEtDeLaTerreFirstSession>20);
            double IntegratedActivitiesSciencesDeLaVieEtDeLaTerreFirstSession;
            do
            {
                System.out.print("Enter the point of the Integrated Activities: ");
                IntegratedActivitiesSciencesDeLaVieEtDeLaTerreFirstSession=input.nextDouble();
            }
            while(IntegratedActivitiesSciencesDeLaVieEtDeLaTerreFirstSession<0||IntegratedActivitiesSciencesDeLaVieEtDeLaTerreFirstSession>20);
            SciencesDeLaVieEtDeLaTerreFirstSession=Third(FirstTestSciencesDeLaVieEtDeLaTerreFirstSession,SecondTestSciencesDeLaVieEtDeLaTerreFirstSession,IntegratedActivitiesSciencesDeLaVieEtDeLaTerreFirstSession);
            double[] SciencesDeLaVieEtDeLaTerreFirstSessionPoints={FirstTestSciencesDeLaVieEtDeLaTerreFirstSession,SecondTestSciencesDeLaVieEtDeLaTerreFirstSession,IntegratedActivitiesSciencesDeLaVieEtDeLaTerreFirstSession};


            //PHYSIQUE CHIMIE
            System.out.print("\nPHYSIQUE CHIMIE\n---------\n---------\n");
            double FirstTestPhysiqueChimieFirstSession;
            do
            {
                System.out.print("Enter the point of the first test: ");
                FirstTestPhysiqueChimieFirstSession=input.nextDouble();
            }
            while(FirstTestPhysiqueChimieFirstSession<0||FirstTestPhysiqueChimieFirstSession>20);
            double SecondTestPhysiqueChimieFirstSession;
            do
            {
                System.out.print("Enter the point of the Second test: ");
                SecondTestPhysiqueChimieFirstSession=input.nextDouble();
            }
            while(SecondTestPhysiqueChimieFirstSession<0||SecondTestPhysiqueChimieFirstSession>20);
            double ThirdTestPhysiqueChimieFirstSession;
            do
            {
                System.out.print("Enter the point of the third test: ");
                ThirdTestPhysiqueChimieFirstSession=input.nextDouble();
            }
            while(ThirdTestPhysiqueChimieFirstSession<0||ThirdTestPhysiqueChimieFirstSession>20);
            double IntegratedActivitiesPhysiqueChimieFirstSession;
            do
            {
                System.out.print("Enter the point of the Integrated Activities: ");
                IntegratedActivitiesPhysiqueChimieFirstSession=input.nextDouble();
            }
            while(IntegratedActivitiesPhysiqueChimieFirstSession<0||IntegratedActivitiesPhysiqueChimieFirstSession>20);
            PhysiqueChimieFirstSession=First(FirstTestPhysiqueChimieFirstSession,SecondTestPhysiqueChimieFirstSession,ThirdTestPhysiqueChimieFirstSession,IntegratedActivitiesPhysiqueChimieFirstSession);
            double[] PhysiqueChimieFirstSessionPoints={FirstTestPhysiqueChimieFirstSession,SecondTestPhysiqueChimieFirstSession,ThirdTestPhysiqueChimieFirstSession,IntegratedActivitiesPhysiqueChimieFirstSession};

            //MATHEMATIQUES
            System.out.print("\nMATHEMATIQUES\n---------\n---------\n");
            double FirstTestMathematiquesFirstSession;
            do
            {
                    System.out.print("Enter the point of the first test: ");
                    FirstTestMathematiquesFirstSession=input.nextDouble();
            }
            while(FirstTestMathematiquesFirstSession<0||FirstTestMathematiquesFirstSession>20);
            double SecondTestMathematiquesFirstSession;
            do
            {
                System.out.print("Enter the point of the Second test: ");
                SecondTestMathematiquesFirstSession=input.nextDouble();
            }
            while(SecondTestMathematiquesFirstSession<0||SecondTestMathematiquesFirstSession>20);
            double ThirdTestMathematiquesFirstSession;
            do
            {
                System.out.print("Enter the point of the Third test: ");
                ThirdTestMathematiquesFirstSession=input.nextDouble();
            }
            while(ThirdTestMathematiquesFirstSession<0||ThirdTestMathematiquesFirstSession>20);
            MathematiquesFirstSession=Second(FirstTestMathematiquesFirstSession,SecondTestMathematiquesFirstSession,ThirdTestMathematiquesFirstSession);
            double[] MathematiquesFirstSessionPoints={FirstTestMathematiquesFirstSession,SecondTestMathematiquesFirstSession,ThirdTestMathematiquesFirstSession};


            //LANGUE FRANCAISE
            System.out.print("\nLANGUE FRANCAISE\n---------\n---------\n");
            double FirstTestLangueFrancaiseFirstSession;
            do
            {
                System.out.print("Enter the point of the first test: ");
                FirstTestLangueFrancaiseFirstSession=input.nextDouble();
            }
            while(FirstTestLangueFrancaiseFirstSession<0||FirstTestLangueFrancaiseFirstSession>20);
            double SecondTestLangueFrancaiseFirstSession;
            do
            {
                System.out.print("Enter the point of the Second test: ");
                SecondTestLangueFrancaiseFirstSession=input.nextDouble();
            }
            while(SecondTestLangueFrancaiseFirstSession<0||SecondTestLangueFrancaiseFirstSession>20);
            double ThirdTestLangueFrancaiseFirstSession;
            do
            {
                System.out.print("Enter the point of the third test: ");
                ThirdTestLangueFrancaiseFirstSession=input.nextDouble();
            }
            while(ThirdTestLangueFrancaiseFirstSession<0||ThirdTestLangueFrancaiseFirstSession>20);
            double ForthTestLangueFrancaiseFirstSession;
            do
            {
                System.out.print("Enter the point of the third test: ");
                ForthTestLangueFrancaiseFirstSession=input.nextDouble();
            }
            while(ForthTestLangueFrancaiseFirstSession<0||ForthTestLangueFrancaiseFirstSession>20);
            double IntegratedActivitiesLangueFrancaiseFirstSession;
            do
            {
                System.out.print("Enter the point of the Integrated Activities: ");
                IntegratedActivitiesLangueFrancaiseFirstSession=input.nextDouble();
            }
            while(IntegratedActivitiesLangueFrancaiseFirstSession<0||IntegratedActivitiesLangueFrancaiseFirstSession>20);
            LangueFrancaiseFirstSession=Forth(FirstTestLangueFrancaiseFirstSession,SecondTestLangueFrancaiseFirstSession,ThirdTestLangueFrancaiseFirstSession,ForthTestLangueFrancaiseFirstSession,IntegratedActivitiesLangueFrancaiseFirstSession);
            double[] LangueFrancaiseFirstSessionPoints={FirstTestLangueFrancaiseFirstSession,SecondTestLangueFrancaiseFirstSession,ThirdTestLangueFrancaiseFirstSession,ForthTestLangueFrancaiseFirstSession,IntegratedActivitiesLangueFrancaiseFirstSession};


            //ASSIDUITE ET CONDUITE
            System.out.print("\nASSIDUITE ET CONDUITE\n---------\n---------\n");
            do
            {
                System.out.print("Enter the point of ASSIDUITE ET CONDUITE: ");
                AssiduiteEtConduiteFirstSession=input.nextDouble();
            }
            while(AssiduiteEtConduiteFirstSession<0||AssiduiteEtConduiteFirstSession>20);
            CycleRateFirstSession=((EducationPhysiqueFirstSession*2)+(HistoireGeographieFirstSession*2)+InformatiqueFirstSession+(InstructionIslamiqueFirstSession*2)+(LangueArabeFirstSession*5)+(LangueFrancaiseFirstSession*5)+(MathematiquesFirstSession*5)+(PhysiqueChimieFirstSession*2)+(SciencesDeLaVieEtDeLaTerreFirstSession*3)+AssiduiteEtConduiteFirstSession)/28;
            //Showing points
            System.out.print("Your notes is:\nEducationPhysique: \n");
            AffishingSecond(EducationPhysiqueFirstSessionPoints,EducationPhysiqueFirstSession);
            System.out.print("\n-------\n-----\n-----\n----");
            System.out.print("\nHistoireGeographie :");
            AffishingFirst(HistoireGeographieFirstSessionPoints,HistoireGeographieFirstSession);
            System.out.print("\n-------\n-----\n-----\n----");
            System.out.print("\nInformatique: \n");
            AffishingFirst(INFORMATIQUEFirstSessionPoints,InformatiqueFirstSession);
            System.out.print("\n-------\n-----\n-----\n----");
            System.out.print("\nInstructionIslamique: \n");
            AffishingThird(InstructionIslamiqueFirstSessionPoints,InstructionIslamiqueFirstSession);
            System.out.print("\n-------\n-----\n-----\n----");
            System.out.print("\nLangueArabe: \n");
            AffishingThird(LangueArabeFirstSessionPoints,LangueArabeFirstSession);
            System.out.print("\n-------\n-----\n-----\n----");
            System.out.print("\nLangueFrancaise: \n");
            AffishingForth(LangueFrancaiseFirstSessionPoints,LangueFrancaiseFirstSession);
            System.out.print("\n-------\n-----\n-----\n----");
            System.out.print("\nMathematiques: \n");
            AffishingSecond(MathematiquesFirstSessionPoints,MathematiquesFirstSession);
            System.out.print("\n-------\n-----\n-----\n----");
            System.out.print("\nPhysiqueChimie: \n");
            AffishingFirst(PhysiqueChimieFirstSessionPoints,PhysiqueChimieFirstSession);
            System.out.print("\n-------\n-----\n-----\n----");
            System.out.print("\nSciencesDeLaVieEtDeLaTerre: \n");
            AffishingThird(SciencesDeLaVieEtDeLaTerreFirstSessionPoints,SciencesDeLaVieEtDeLaTerreFirstSession);
            System.out.print("\n-------\n-----\n-----\n----");
            System.out.print("\nAssiduite Et Conduite: "+AssiduiteEtConduiteFirstSession);
            System.out.print("\n-------\n-----\n-----\n----");
            System.out.print("\nYour Cycle Rate is: "+CycleRateFirstSession);

        //Entering points of Second Session
        double EducationPhysiqueSecondSession;
        double HistoireGeographieSecondSession;
        double InformatiqueSecondSession;
        double InstructionIslamiqueSecondSession;
        double LangueArabeSecondSession;
        double LangueFrancaiseSecondSession;
        double MathematiquesSecondSession;
        double PhysiqueChimieSecondSession;
        double SciencesDeLaVieEtDeLaTerreSecondSession;
        double AssiduiteEtConduiteSecondSession;
        double CycleRateSecondSession;
        //Entering Points
        System.out.print("Now, Start Entering your points of the second session: ");
        //Education Physique
        System.out.print("\nEducation Physique\n---------\n---------\n");
        double FirstTestEducationPhysiqueSecondSession;
        do
        {
            System.out.print("Enter the point of the first test: ");
            FirstTestEducationPhysiqueSecondSession=input.nextDouble();
        }
        while(FirstTestEducationPhysiqueSecondSession<0||FirstTestEducationPhysiqueSecondSession>20);
        double SecondTestEducationPhysiqueSecondSession;
        do
        {
            System.out.print("Enter the point of the Second test: ");
            SecondTestEducationPhysiqueSecondSession=input.nextDouble();
        }
        while(SecondTestEducationPhysiqueSecondSession<0||SecondTestEducationPhysiqueSecondSession>20);
        double ThirdTestEducationPhysiqueSecondSession;
        do
        {
            System.out.print("Enter the point of the Third test: ");
            ThirdTestEducationPhysiqueSecondSession=input.nextDouble();
        }
        while(ThirdTestEducationPhysiqueSecondSession<0||ThirdTestEducationPhysiqueSecondSession>20);
        EducationPhysiqueSecondSession=Second(FirstTestEducationPhysiqueSecondSession,SecondTestEducationPhysiqueSecondSession,ThirdTestEducationPhysiqueSecondSession);
        double[] EducationPhysiqueSecondSessionPoints={FirstTestEducationPhysiqueSecondSession,SecondTestEducationPhysiqueSecondSession,ThirdTestEducationPhysiqueSecondSession};

        //HistoireGeographie
        System.out.print("\nHistoire Geographie\n---------\n---------\n");
        double FirstTestHistoireGeographieSecondSession;
        do
        {
            System.out.print("Enter the point of the first test: ");
            FirstTestHistoireGeographieSecondSession=input.nextDouble();
        }
        while(FirstTestHistoireGeographieSecondSession<0||FirstTestHistoireGeographieSecondSession>20);
        double SecondTestHistoireGeographieSecondSession;
        do
        {
            System.out.print("Enter the point of the Second test: ");
            SecondTestHistoireGeographieSecondSession=input.nextDouble();
        }
        while(SecondTestHistoireGeographieSecondSession<0||SecondTestHistoireGeographieSecondSession>20);
        double ThirdTestHistoireGeographieSecondSession;
        do
        {
            System.out.print("Enter the point of the Second test: ");
            ThirdTestHistoireGeographieSecondSession=input.nextDouble();
        }
        while(ThirdTestHistoireGeographieSecondSession<0||ThirdTestHistoireGeographieSecondSession>20);
        double IntegratedActivitiesHistoireGeographieSecondSession;
        do
        {
            System.out.print("Enter the point of the Integrated Activities: ");
            IntegratedActivitiesHistoireGeographieSecondSession=input.nextDouble();
        }
        while(IntegratedActivitiesHistoireGeographieSecondSession<0||IntegratedActivitiesHistoireGeographieSecondSession>20);
        HistoireGeographieSecondSession=First(FirstTestHistoireGeographieSecondSession,SecondTestHistoireGeographieSecondSession,ThirdTestHistoireGeographieSecondSession,IntegratedActivitiesHistoireGeographieSecondSession);
        double[] HistoireGeographieSecondSessionPoints={FirstTestHistoireGeographieSecondSession,SecondTestHistoireGeographieSecondSession,ThirdTestHistoireGeographieSecondSession,IntegratedActivitiesHistoireGeographieSecondSession};


        //INFORMATIQUE
        System.out.print("\nINFORMATIQUE\n---------\n---------\n");
        double FirstTestINFORMATIQUESecondSession;
        do
        {
            System.out.print("Enter the point of the first test: ");
            FirstTestINFORMATIQUESecondSession=input.nextDouble();
        }
        while(FirstTestINFORMATIQUESecondSession<0||FirstTestINFORMATIQUESecondSession>20);
        double SecondTestINFORMATIQUESecondSession;
        do
        {
            System.out.print("Enter the point of the Second test: ");
            SecondTestINFORMATIQUESecondSession=input.nextDouble();
        }
        while(SecondTestINFORMATIQUESecondSession<0||SecondTestINFORMATIQUESecondSession>20);
        double ThirdTestINFORMATIQUESecondSession;
        do
        {
            System.out.print("Enter the point of the third test: ");
            ThirdTestINFORMATIQUESecondSession=input.nextDouble();
        } 
        while(ThirdTestINFORMATIQUESecondSession<0||ThirdTestINFORMATIQUESecondSession>20);
        double IntegratedActivitiesINFORMATIQUESecondSession;
        do
        {
            System.out.print("Enter the point of the Integrated Activities: ");
            IntegratedActivitiesINFORMATIQUESecondSession=input.nextDouble();
        }
        while(IntegratedActivitiesINFORMATIQUESecondSession<0||IntegratedActivitiesINFORMATIQUESecondSession>20);
        InformatiqueSecondSession=First(FirstTestINFORMATIQUESecondSession,SecondTestINFORMATIQUESecondSession,ThirdTestINFORMATIQUESecondSession,IntegratedActivitiesINFORMATIQUESecondSession);
        double[] INFORMATIQUESecondSessionPoints={FirstTestINFORMATIQUESecondSession,SecondTestINFORMATIQUESecondSession,ThirdTestINFORMATIQUESecondSession,IntegratedActivitiesINFORMATIQUESecondSession};

        //INSTRUCTION ISLAMIQUE
        System.out.print("\nINSTRUCTION ISLAMIQUE \n---------\n---------\n");
        double FirstTestInstructionIslamiqueSecondSession;
        do
        {
            System.out.print("Enter the point of the first test: ");
            FirstTestInstructionIslamiqueSecondSession=input.nextDouble();
            }
            while(FirstTestInstructionIslamiqueSecondSession<0||FirstTestInstructionIslamiqueSecondSession>20);
            double SecondTestInstructionIslamiqueSecondSession;
            do
            {
                System.out.print("Enter the point of the Second test: ");
                SecondTestInstructionIslamiqueSecondSession=input.nextDouble();
            }
            while(SecondTestInstructionIslamiqueSecondSession<0||SecondTestInstructionIslamiqueSecondSession>20);
            double IntegratedActivitiesInstructionIslamiqueSecondSession;
            do
            {
                System.out.print("Enter the point of the Integrated Activities: ");
                IntegratedActivitiesInstructionIslamiqueSecondSession=input.nextDouble();
            }
            while(IntegratedActivitiesInstructionIslamiqueSecondSession<0||IntegratedActivitiesInstructionIslamiqueSecondSession>20);
            InstructionIslamiqueSecondSession=Third(FirstTestInstructionIslamiqueSecondSession,SecondTestInstructionIslamiqueSecondSession,IntegratedActivitiesInstructionIslamiqueSecondSession);
            double[] InstructionIslamiqueSecondSessionPoints={FirstTestInstructionIslamiqueSecondSession,SecondTestInstructionIslamiqueSecondSession,IntegratedActivitiesInstructionIslamiqueSecondSession};


            //LANGUE ARABE
            System.out.print("\nLANGUE ARABE \n---------\n---------\n");
            double FirstTestLangueArabeSecondSession;
            do
            {
                System.out.print("Enter the point of the first test: ");
                FirstTestLangueArabeSecondSession=input.nextDouble();
            }
            while(FirstTestLangueArabeSecondSession<0||FirstTestLangueArabeSecondSession>20);
            double SecondTestLangueArabeSecondSession;
            do
            {
                System.out.print("Enter the point of the Second test: ");
                SecondTestLangueArabeSecondSession=input.nextDouble();
            }
            while(SecondTestLangueArabeSecondSession<0||SecondTestLangueArabeSecondSession>20);
            double IntegratedActivitiesLangueArabeSecondSession;
            do
            {
                System.out.print("Enter the point of the Integrated Activities: ");
                IntegratedActivitiesLangueArabeSecondSession=input.nextDouble();
            }
            while(IntegratedActivitiesLangueArabeSecondSession<0||IntegratedActivitiesLangueArabeSecondSession>20);
            LangueArabeSecondSession=Third(FirstTestLangueArabeSecondSession,SecondTestLangueArabeSecondSession,IntegratedActivitiesLangueArabeSecondSession);
            double[] LangueArabeSecondSessionPoints={FirstTestLangueArabeSecondSession,SecondTestLangueArabeSecondSession,IntegratedActivitiesLangueArabeSecondSession};

        

            //SC. DE LA VIE ET DE LA TERRE
            System.out.print("\nSC. DE LA VIE ET DE LA TERRE \n---------\n---------\n");
            double FirstTestSciencesDeLaVieEtDeLaTerreSecondSession;
            do
            {
                System.out.print("Enter the point of the first test: ");
                FirstTestSciencesDeLaVieEtDeLaTerreSecondSession=input.nextDouble();
            }
            while(FirstTestSciencesDeLaVieEtDeLaTerreSecondSession<0||FirstTestSciencesDeLaVieEtDeLaTerreSecondSession>20);
            double SecondTestSciencesDeLaVieEtDeLaTerreSecondSession;
            do
            {
                System.out.print("Enter the point of the Second test: ");
                SecondTestSciencesDeLaVieEtDeLaTerreSecondSession=input.nextDouble();
            }
            while(SecondTestSciencesDeLaVieEtDeLaTerreSecondSession<0||SecondTestSciencesDeLaVieEtDeLaTerreSecondSession>20);
            double IntegratedActivitiesSciencesDeLaVieEtDeLaTerreSecondSession;
            do
            {
                System.out.print("Enter the point of the Integrated Activities: ");
                IntegratedActivitiesSciencesDeLaVieEtDeLaTerreSecondSession=input.nextDouble();
            }
            while(IntegratedActivitiesSciencesDeLaVieEtDeLaTerreSecondSession<0||IntegratedActivitiesSciencesDeLaVieEtDeLaTerreSecondSession>20);
            SciencesDeLaVieEtDeLaTerreSecondSession=Third(FirstTestSciencesDeLaVieEtDeLaTerreSecondSession,SecondTestSciencesDeLaVieEtDeLaTerreSecondSession,IntegratedActivitiesSciencesDeLaVieEtDeLaTerreSecondSession);
            double[] SciencesDeLaVieEtDeLaTerreSecondSessionPoints={FirstTestSciencesDeLaVieEtDeLaTerreSecondSession,SecondTestSciencesDeLaVieEtDeLaTerreSecondSession,IntegratedActivitiesSciencesDeLaVieEtDeLaTerreSecondSession};


            //PHYSIQUE CHIMIE
            System.out.print("\nPHYSIQUE CHIMIE\n---------\n---------\n");
            double FirstTestPhysiqueChimieSecondSession;
            do
            {
                System.out.print("Enter the point of the first test: ");
                FirstTestPhysiqueChimieSecondSession=input.nextDouble();
            }
            while(FirstTestPhysiqueChimieSecondSession<0||FirstTestPhysiqueChimieSecondSession>20);
            double SecondTestPhysiqueChimieSecondSession;
            do
            {
                System.out.print("Enter the point of the Second test: ");
                SecondTestPhysiqueChimieSecondSession=input.nextDouble();
            }
            while(SecondTestPhysiqueChimieSecondSession<0||SecondTestPhysiqueChimieSecondSession>20);
            double ThirdTestPhysiqueChimieSecondSession;
            do
            {
                System.out.print("Enter the point of the third test: ");
                ThirdTestPhysiqueChimieSecondSession=input.nextDouble();
            }
            while(ThirdTestPhysiqueChimieSecondSession<0||ThirdTestPhysiqueChimieSecondSession>20);
            double IntegratedActivitiesPhysiqueChimieSecondSession;
            do
            {
                System.out.print("Enter the point of the Integrated Activities: ");
                IntegratedActivitiesPhysiqueChimieSecondSession=input.nextDouble();
            }
            while(IntegratedActivitiesPhysiqueChimieSecondSession<0||IntegratedActivitiesPhysiqueChimieSecondSession>20);
            PhysiqueChimieSecondSession=First(FirstTestPhysiqueChimieSecondSession,SecondTestPhysiqueChimieSecondSession,ThirdTestPhysiqueChimieSecondSession,IntegratedActivitiesPhysiqueChimieSecondSession);
            double[] PhysiqueChimieSecondSessionPoints={FirstTestPhysiqueChimieSecondSession,SecondTestPhysiqueChimieSecondSession,ThirdTestPhysiqueChimieSecondSession,IntegratedActivitiesPhysiqueChimieSecondSession};

            //MATHEMATIQUES
            System.out.print("\nMATHEMATIQUES\n---------\n---------\n");
            double FirstTestMathematiquesSecondSession;
            do
            {
                    System.out.print("Enter the point of the first test: ");
                    FirstTestMathematiquesSecondSession=input.nextDouble();
            }
            while(FirstTestMathematiquesSecondSession<0||FirstTestMathematiquesSecondSession>20);
            double SecondTestMathematiquesSecondSession;
            do
            {
                System.out.print("Enter the point of the Second test: ");
                SecondTestMathematiquesSecondSession=input.nextDouble();
            }
            while(SecondTestMathematiquesSecondSession<0||SecondTestMathematiquesSecondSession>20);
            double ThirdTestMathematiquesSecondSession;
            do
            {
                System.out.print("Enter the point of the Third test: ");
                ThirdTestMathematiquesSecondSession=input.nextDouble();
            }
            while(ThirdTestMathematiquesSecondSession<0||ThirdTestMathematiquesSecondSession>20);
            MathematiquesSecondSession=Second(FirstTestMathematiquesSecondSession,SecondTestMathematiquesSecondSession,ThirdTestMathematiquesSecondSession);
            double[] MathematiquesSecondSessionPoints={FirstTestMathematiquesSecondSession,SecondTestMathematiquesSecondSession,ThirdTestMathematiquesSecondSession};


            //LANGUE FRANCAISE
            System.out.print("\nLANGUE FRANCAISE\n---------\n---------\n");
            double FirstTestLangueFrancaiseSecondSession;
            do
            {
                System.out.print("Enter the point of the first test: ");
                FirstTestLangueFrancaiseSecondSession=input.nextDouble();
            }
            while(FirstTestLangueFrancaiseSecondSession<0||FirstTestLangueFrancaiseSecondSession>20);
            double SecondTestLangueFrancaiseSecondSession;
            do
            {
                System.out.print("Enter the point of the Second test: ");
                SecondTestLangueFrancaiseSecondSession=input.nextDouble();
            }
            while(SecondTestLangueFrancaiseSecondSession<0||SecondTestLangueFrancaiseSecondSession>20);
            double ThirdTestLangueFrancaiseSecondSession;
            do
            {
                System.out.print("Enter the point of the third test: ");
                ThirdTestLangueFrancaiseSecondSession=input.nextDouble();
            }
            while(ThirdTestLangueFrancaiseSecondSession<0||ThirdTestLangueFrancaiseSecondSession>20);
            double ForthTestLangueFrancaiseSecondSession;
            do
            {
                System.out.print("Enter the point of the third test: ");
                ForthTestLangueFrancaiseSecondSession=input.nextDouble();
            }
            while(ForthTestLangueFrancaiseSecondSession<0||ForthTestLangueFrancaiseSecondSession>20);
            double IntegratedActivitiesLangueFrancaiseSecondSession;
            do
            {
                System.out.print("Enter the point of the Integrated Activities: ");
                IntegratedActivitiesLangueFrancaiseSecondSession=input.nextDouble();
            }
            while(IntegratedActivitiesLangueFrancaiseSecondSession<0||IntegratedActivitiesLangueFrancaiseSecondSession>20);
            LangueFrancaiseSecondSession=Forth(FirstTestLangueFrancaiseSecondSession,SecondTestLangueFrancaiseSecondSession,ThirdTestLangueFrancaiseSecondSession,ForthTestLangueFrancaiseSecondSession,IntegratedActivitiesLangueFrancaiseSecondSession);
            double[] LangueFrancaiseSecondSessionPoints={FirstTestLangueFrancaiseSecondSession,SecondTestLangueFrancaiseSecondSession,ThirdTestLangueFrancaiseSecondSession,ForthTestLangueFrancaiseSecondSession,IntegratedActivitiesLangueFrancaiseSecondSession};


            //ASSIDUITE ET CONDUITE
            System.out.print("\nASSIDUITE ET CONDUITE\n---------\n---------\n");
            do
            {
                System.out.print("Enter the point of ASSIDUITE ET CONDUITE: ");
                AssiduiteEtConduiteSecondSession=input.nextDouble();
            }
            while(AssiduiteEtConduiteSecondSession<0||AssiduiteEtConduiteSecondSession>20);
            CycleRateSecondSession=((EducationPhysiqueSecondSession*2)+(HistoireGeographieSecondSession*2)+InformatiqueSecondSession+(InstructionIslamiqueSecondSession*2)+(LangueArabeSecondSession*5)+(LangueFrancaiseSecondSession*5)+(MathematiquesSecondSession*5)+(PhysiqueChimieSecondSession*2)+(SciencesDeLaVieEtDeLaTerreSecondSession*3)+AssiduiteEtConduiteSecondSession)/28;
            //Showing points
            System.out.print("Your notes is:\nEducationPhysique: \n");
            AffishingSecond(EducationPhysiqueSecondSessionPoints,EducationPhysiqueSecondSession);
            System.out.print("\n-------\n-----\n-----\n----");
            System.out.print("\nHistoireGeographie :");
            AffishingFirst(HistoireGeographieSecondSessionPoints,HistoireGeographieSecondSession);
            System.out.print("\n-------\n-----\n-----\n----");
            System.out.print("\nInformatique: \n");
            AffishingFirst(INFORMATIQUESecondSessionPoints,InformatiqueSecondSession);
            System.out.print("\n-------\n-----\n-----\n----");
            System.out.print("\nInstructionIslamique: \n");
            AffishingThird(InstructionIslamiqueSecondSessionPoints,InstructionIslamiqueSecondSession);
            System.out.print("\n-------\n-----\n-----\n----");
            System.out.print("\nLangueArabe: \n");
            AffishingThird(LangueArabeSecondSessionPoints,LangueArabeSecondSession);
            System.out.print("\n-------\n-----\n-----\n----");
            System.out.print("\nLangueFrancaise: \n");
            AffishingForth(LangueFrancaiseSecondSessionPoints,LangueFrancaiseSecondSession);
            System.out.print("\n-------\n-----\n-----\n----");
            System.out.print("\nMathematiques: \n");
            AffishingSecond(MathematiquesSecondSessionPoints,MathematiquesSecondSession);
            System.out.print("\n-------\n-----\n-----\n----");
            System.out.print("\nPhysiqueChimie: \n");
            AffishingFirst(PhysiqueChimieSecondSessionPoints,PhysiqueChimieSecondSession);
            System.out.print("\n-------\n-----\n-----\n----");
            System.out.print("\nSciencesDeLaVieEtDeLaTerre: \n");
            AffishingThird(SciencesDeLaVieEtDeLaTerreSecondSessionPoints,SciencesDeLaVieEtDeLaTerreSecondSession);
            System.out.print("\n-------\n-----\n-----\n----");
            System.out.print("\nAssiduite Et Conduite: "+AssiduiteEtConduiteSecondSession);
            System.out.print("\n-------\n-----\n-----\n----");
            System.out.print("\nYour Cycle Rate is: "+CycleRateSecondSession);
            double FinalNote=((CycleRateFirstSession+CycleRateSecondSession)/2);
            if(FinalNote>=10)
            {
                System.out.println("\nYou are successful");
            }
            else if(FinalNote<10)
            {
                System.out.println("\nyou fail. Good luck in the coming years");
            }
            //End Program
            input.close();
            }
}
