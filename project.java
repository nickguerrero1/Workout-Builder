import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;

class Workout{
    public static void main(String[] args){
        String[] chest = new String[] {"Bar Dip","Bench Press","Cable Chest Press","Close-Grip Bench Press",
        "Close-Grip Feet-Up Bench Press","Decline Bench Press","Dumbbell Chest Fly","Dumbbell Chest Press",
        "Dumbbell Floor Press","Dumbbell Pullover","Feet-Up Bench Press","Floor Press","Incline Bench Press",
        "Incline Dumbbell Press","Incline Push-Up","Kneeling Incline Push-Up","Kneeling Push-Up","Machine Chest Fly",
        "Machine Chest Press","Pec Deck","Push-Up","Push-Up Against Wall","Resistance Band Chest Fly",
        "Smith Machine Bench Press","Smith Machine Incline Bench Press","Standing Cable Chest Fly"};
        int numChest = 26;

        String[] shoulders = new String[] {"Band External Shoulder Rotation","Band Internal Shoulder Rotation",
        "Band Pull-Apart","Barbell Front Raise","Barbell Rear Delt Row","Barbell Upright Row","Behind the Neck Press",
        "Cable Lateral Raise","Cable Rear Delt Row","Dumbbell Front Raise",
        "Dumbbell Horizontal Internal Shoulder Rotation","Dumbbell Horizontal External Shoulder Rotation",
        "Dumbbell Lateral Raise","Dumbbell Rear Delt Row","Dumbbell Shoulder Press","Face Pull",
        "Lying Dumbbell External Shoulder Rotation","Lying Dumbbell Internal Shoulder Rotation","Machine Lateral Raise",
        "Machine Shoulder Press","Monkey Row","Overhead Press","Power Jerk","Push Press","Reverse Dumbbell Flyes",
        "Reverse Machine Fly","Seated Dumbbell Shoulder Press","Seated Barbell Overhead Press",
        "Seated Smith Machine Shoulder Press","Snatch Grip Behind the Neck Press","Squat Jerk","Split Jerk"};
        int numShoulders = 32;

        String[] biceps = new String[] {"Barbell Curl","Barbell Preacher Curl","Cable Curl With Bar","Cable Curl With Rope",
        "Concentration Curl","Dumbbell Curl","Dumbbell Preacher Curl","Hammer Curl","Incline Dumbbell Curl","Spider Curl"};
        int numBiceps = 10;

        String[] triceps = new String[] {"Barbell Standing Triceps Extension","Barbell Lying Triceps Extension","Bench Dip",
        "Close-Grip Push-Up","Dumbbell Lying Triceps Extension","Dumbbell Standing Triceps Extension",
        "Overhead Cable Triceps Extension","Tricep Pushdown With Bar","Tricep Pushdown With Rope"};
        int numTriceps = 9;

        String[] legs = new String[] {"Air Squat","Barbell Hack Squat","Barbell Lunge","Body Weight Lunge","Box Squat",
        "Bulgarian Split Squat","Chair Squat","Dumbbell Lunge","Dumbbell Squat","Front Squat","Goblet Squat",
        "Hack Squat Machine","Half Air Squat","Hip Adduction Machine","Landmine Hack Squat","Landmine Squat",
        "Leg Extension","Leg Press","Lying Leg Curl","Pause Squat","Safety Bar Squat","Seated Leg Curl",
        "Shallow Body Weight Lunge","Side Lunges (Bodyweight)","Smith Machine Squat","Squat","Step Up"};
        int numLegs = 27;

        String [] back = new String[] {"Back Extension","Barbell Row","Barbell Shrug","Block Snatch",
        "Cable Close Grip Seated Row","Cable Wide Grip Seated Row","Chin-Up","Clean","Clean and Jerk","Deadlift",
        "Deficit Deadlift","Dumbbell Deadlift","Dumbbell Romanian Deadlift","Dumbbell Row","Dumbbell Shrug",
        "Floor Back Extension","Good Morning","Hang Clean","Hang Power Clean","Hang Power Snatch","Hang Snatch",
        "Inverted Row","Inverted Row with Underhand Grip","Kettlebell Swing","Lat Pulldown With Pronated Grip",
        "Lat Pulldown With Supinated Grip","One-Handed Cable Row","One-Handed Lat Pulldown","Pause Deadlift","Pendlay Row",
        "Power Clean","Power Snatch","Pull-Up","Rack Pull","Romanian Deadlift","Seal Row","Seated Machine Row","Snatch",
        "Snatch Grip Deadlift","Stiff-Legged Deadlift","Straight Arm Lat Pulldown","Sumo Deadlift","T-Bar Row",
        "Trap Bar Deadlift With High Handles","Trap Bar Deadlift With Low Handles"};
        int numBack = 45;

        String [] glutes = new String[] {"Banded Side Kicks","Cable Pull Through","Clamshells","Fire Hydrants",
        "Glute Bridge","Hip Abduction Against Band","Hip Abduction Machine","Hip Thrust","Hip Thrust Machine",
        "Hip Thrust With Band Around Knees","Lateral Walk With Band","One-Legged Glute Bridge","One-Legged Hip Thrust",
        "Step Up"};
        int numGlutes = 14;

        String[] abs = new String[] {"Cable Crunch","Crunch","Hanging Leg Raise","Hanging Knee Raise","Hanging Sit-Up",
        "High to Low Wood Chop with Band","Horizontal Wood Chop with Band","Kneeling Ab Wheel Roll-Out","Kneeling Plank",
        "Kneeling Side Plank","Lying Leg Raise","Lying Windshield Wiper","Lying Windshield Wiper with Bent Knees",
        "Machine Crunch","Oblique Crunch","Oblique Sit-Up","Plank","Side Plank","Sit-Up"};
        int numAbs = 19;

        String[] calves = new String[] {"Eccentric Heel Drop","Heel Raise","Seated Calf Raise","Standing Calf Raise"};
        int numCalves = 4;

        String[] forearms = new String[] {"Barbell Wrist Curl","Barbell Wrist Curl Behind the Back","Bar Hang",
        "Dumbbell Wrist Curl","Farmers Walk","Fat Bar Deadlift","Gripper","One-Handed Bar Hang","Plate Pinch",
        "Plate Wrist Curl","Towel Pull-Up","Barbell Wrist Extension","Dumbbell Wrist Extension"};
        int numForearms = 13;
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = sc.nextLine();

        System.out.println("Enter one of the following groups: [Push, Pull, Legs, Full] ");
        String type = sc.nextLine();

        System.out.println("Enter desired number of exercises: ");
        int exercises = sc.nextInt();

        System.out.println("Enter intensity: [1, 2, 3] ");
        int intensity = sc.nextInt();

        sc.close();
        ArrayList<String> workout = new ArrayList<String>();

        Random rand = new Random();
        if(type.equals("Push")){
            for(int i = 0; i < exercises; i++){
                int randNum = rand.nextInt(3);
                if(randNum == 0){
                    int r = rand.nextInt(numChest);
                    workout.add(chest[r]);
                }   else if(randNum == 1){
                    int r = rand.nextInt(numShoulders);
                    workout.add(shoulders[r]);
                }   else{
                    int r = rand.nextInt(numTriceps);
                    workout.add(triceps[r]);
                } 
            }
        }   else if(type.equals("Pull")){
            for(int i = 0; i < exercises; i++){
                int randNum = rand.nextInt(3);
                if(randNum == 0){
                    int r = rand.nextInt(numBack);
                    workout.add(back[r]);
                }   else if(randNum == 1){
                    int r = rand.nextInt(numBiceps);
                    workout.add(biceps[r]);
                }   else{
                    int r = rand.nextInt(numForearms);
                    workout.add(forearms[r]);
                }
            }
        }   else if(type.equals("Legs")){
            for(int i = 0; i < exercises; i++){
                int randNum = rand.nextInt(3);
                if(randNum == 0){
                    int r = rand.nextInt(numLegs);
                    workout.add(legs[r]);
                }   else if(randNum == 1){
                    int r = rand.nextInt(numGlutes);
                    workout.add(glutes[r]);
                }   else{
                    int r = rand.nextInt(numCalves);
                    workout.add(calves[r]);
                }
            }
        }   else if(type.equals("Full")){
            for(int i = 0; i < exercises; i++){
                int randNum = rand.nextInt(10);
                if(randNum == 0){
                    int r = rand.nextInt(numChest);
                    workout.add(chest[r]);
                }   else if(randNum == 1){
                    int r = rand.nextInt(numShoulders);
                    workout.add(shoulders[r]);
                }   else if(randNum == 2){
                    int r = rand.nextInt(numBiceps);
                    workout.add(biceps[r]);
                }   else if(randNum == 3){
                    int r = rand.nextInt(numTriceps);
                    workout.add(triceps[r]);
                }   else if(randNum == 4){
                    int r = rand.nextInt(numLegs);
                    workout.add(legs[r]);
                }   else if(randNum == 5){
                    int r = rand.nextInt(numBack);
                    workout.add(back[r]);
                }   else if(randNum == 6){
                    int r = rand.nextInt(numGlutes);
                    workout.add(glutes[r]);
                }   else if(randNum == 7){
                    int r = rand.nextInt(numAbs);
                    workout.add(abs[r]);
                }   else if(randNum == 8){
                    int r = rand.nextInt(numCalves);
                    workout.add(calves[r]);
                }   else{
                    int r = rand.nextInt(numForearms);
                    workout.add(forearms[r]);
                }   
            }
        }   

        System.out.println("\n" + name + "'s Workout Today:\n");
        for(int i = 0; i < workout.size(); i++){
            int set = 0;
            int rep = 0;
            if(intensity == 1){
                set = rand.nextInt(2) + 2;
                rep = rand.nextInt(4) + 5;
            }  else if(intensity == 2){
                set = rand.nextInt(3) + 2;
                rep = rand.nextInt(5) + 6;
            }   else if(intensity == 3){
                set = rand.nextInt(4) + 2;
                rep = rand.nextInt(7) + 7;
            }
            System.out.println("[" + set + " X " + rep + "] " + workout.get(i));
        }
        System.out.println();
    }
}