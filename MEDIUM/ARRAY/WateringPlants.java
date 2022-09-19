public class WateringPlants {
    public int wateringPlants(int[] plants, int capacity) {
int steps=0;
int useCapacity=capacity;
for (int i=0;i<plants.length;i++){
    if (plants[i]<=useCapacity){
       useCapacity=useCapacity-plants[i];
       steps++;
    }
    else {
steps=steps+i;  
steps=steps+i+1;      
useCapacity=capacity;
if (plants[i]<=useCapacity){
    useCapacity=useCapacity-plants[i];
}
    }
}


return steps;
}
}