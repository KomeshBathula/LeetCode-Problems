class Solution {
    public int scoreDifference(int[] nums) {
        int player1Score = 0;
        int player2Score = 0;
        boolean player1 = true;
        boolean player2 = false;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 != 0 ) {
                player1 = !player1;
                player2 = !player2;
            }
            if ((i + 1) % 6 == 0) {
                player1 = !player1;
                player2 = !player2;
            }
            if (player1) player1Score += nums[i];
            else player2Score += nums[i];
            // System.out.println(player1Score +" "+player2Score);
        }
        // System.out.println(player1Score);
        // System.out.println(player2Score);
        return player1Score - player2Score;
    }
}