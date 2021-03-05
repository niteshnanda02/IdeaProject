package codeforcesDiv316Feb;

import FastIO.InputReader;
import FastIO.OutputWriter;

public class TaskD {
    class Hold {
        int data;
        Hold left,right;

        public Hold(int data) {
            this.data = data;
            left=null;
            right=null;
        }
    }
    static int[] depth;
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        testNumber=in.nextInt();
        while (testNumber-->0){
            int n=in.nextInt();
            depth =new int[n+1];
            int[] arr=in.nextIntArray(n);
            Hold root=construct(arr,0,n-1);
            depth(root,0);
            for (int i = 0; i <n ; i++) {
                out.print(depth[arr[i]]+" ");
            }
            out.println();
        }
    }

    private void depth(Hold root, int i) {
        if(root==null)
            return;
        depth[root.data]=i;
        depth(root.left,i+1);
        depth(root.right,i+1);
    }



    private Hold construct(int[] a, int l, int r) {
        if(l>r)
            return null;
        int maxIndex=max(a,l,r);
        Hold node=new Hold(a[maxIndex]);
        if(l==r)
            return node;
        node.left=construct(a,l,maxIndex-1);
        node.right=construct(a,maxIndex+1,r);

        return node;

    }

    private int max(int[] a, int l, int r) {
        int index=l,max=a[l];
        for (int i = l+1; i <=r ; i++) {
            if(a[i]>max){
                max=a[i];
                index=i;
            }
        }
        return index;

    }
}
