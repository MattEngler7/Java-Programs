
public class Database {
	
	int[] DBnums;

	Database(int [] inputnum)
	{
		this.DBnums = inputnum;
	}
	void SortAscend()
    {
        int n = DBnums.length;
        for (int i = 0; i < n-1; i++)
            for (int j = 0; j < n-i-1; j++)
                if (DBnums[j] > DBnums[j+1])
                {
                    // swap temp and arr[i]
                    int temp = DBnums[j];
                    DBnums[j] = DBnums[j+1];
                    DBnums[j+1] = temp;
                }
		return;
		
    }
}	