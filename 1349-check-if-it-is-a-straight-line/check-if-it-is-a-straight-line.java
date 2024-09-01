class Solution {
    public boolean checkStraightLine(int[][] coordinates) {
        //TO CHECK WHETHER LINES ARE STRAIGHT WELL CHECK THE SLOPE
        //IF AT ANY POINT SLOPE DOEST COMES OUT TO BE EQUAL RETURN FALSE;
        //edge case:- there might be a /0 exception while calculating slope=dy/dx
        //so to be on the safer side well be cross multiplying

        int d_y=coordinates[1][1]-coordinates[0][1];//y2-y1;
        int d_x=coordinates[1][0]-coordinates[0][0];//x2-x1;

        //slope = d_y / d_x;
        
        //start from 2 and get the slope with 0
        for(int i=2;i<coordinates.length;i++)
        {
            int d_y_i=coordinates[i][1]-coordinates[0][1];
            int d_x_i=coordinates[i][0]-coordinates[0][0];

            //check slope
            //slope = d_y_i/d_x_i
            //to be on the safe side
            //cross multiply
            //d_y_i * d_x == d_x_i * d_y
            if(d_y_i * d_x != d_x_i * d_y)
            {
                return false;
            }
        }
        return true;



    }
}