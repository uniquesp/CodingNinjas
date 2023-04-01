package DSA.Tries;

class TrieNode{
    char data;
    boolean isTerminating;
    TrieNode children[];
    int childCount;

    public TrieNode(char data){
        this.data = data;
        isTerminating = false;
        children = new TrieNode[26];
        childCount = 0;
    }    
}


class TriesImplementation {
    private TrieNode root;
    public TriesImplementation(){
        root = new TrieNode('\0');
    }

     public void add(String word){
        add(root,word);
    }
    public void add(TrieNode root,String word){
        if(word.length()==0){
            root.isTerminating = true;
            return;
        }

        int childIndex = word.charAt(0) - 'a';
        TrieNode child = root.children[childIndex];
        if(child == null){
            child = new TrieNode(word.charAt(0));
            root.children[childIndex] = child;
            root.childCount++;
        }
        add(child,word.substring(1));
    }

   
	public boolean search(String word){
		return search(root,word);
	}

	private boolean search(TrieNode root, String word){
		if(word.length()==0){
			if(root.isTerminating==true){
				return true;
			}else{
				return false;
			}
		}
		boolean ans = false;
		int childIndex = word.charAt(0)-'a';
		TrieNode child = root.children[childIndex];
		if(child!=null){
			ans = search(child,word.substring(1));
		}

		return ans;

	}


   public void remove(String word){
        remove(root,word);
    }

    public void remove(TrieNode root,String word){
        if(word.length()==0){
            root.isTerminating = false;
            return;
        }

        int childIndex = word.charAt(0) - 'a';
        TrieNode child = root.children[childIndex];
        if(child == null){
            return;
        }
        remove(child,word.substring(1));
            //we can remove child only if its non terminating and its no of childs are 0
        if(!child.isTerminating){
            int numChild=0;
            for(int i=0;i<26;i++){
                if(child.children[i]!=null){
                    numChild++;
                }
            }
            if(numChild==0){
                //we can delete child
                root.children[childIndex] = null;
                child = null;
            }
        }
    }

//optimized remove1 function
    public void remove1(TrieNode root,String word){
        if(word.length()==0){
            root.isTerminating = false;
            return;
        }

        int childIndex = word.charAt(0) - 'a';
        TrieNode child = root.children[childIndex];
        if(child == null){
            return;
        }
        remove1(child,word.substring(1));
            //we can remove child only if its non terminating and its no of childs are 0
        if(!child.isTerminating && child.childCount==0){
                root.children[childIndex] = null;
                child = null;
                root.childCount--;
        }
    }
}


public class TriesUse1{
        public static void main(String[] args) {
        TriesImplementation t = new TriesImplementation();
        t.add("this");
        t.add("news");
        t.add("notes");
        System.out.println(t.search("news"));
        t.remove("new");
        System.out.println(t.search("news"));

    }

}
