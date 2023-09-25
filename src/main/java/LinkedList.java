
@SuppressWarnings("ALL")
public class LinkedList<T> {

    Node<T> head;
    Node<T> tail;
    Node<T> next;

    public LinkedList() {
        this.head = null;
        this.tail = null;
    }

    public Node<T> append(T data) {
        Node<T> toAppend = new Node<>(data);

        if (this.head == null) {
            this.head = toAppend;
            this.tail = toAppend;
        }
        return toAppend;
    }

    public Node<T> insert(int location, T data) {
        Node<T> toInsert = new Node<>(data);

        if (this.head != null) {
            if (location > 0 ) {
                this.tail = toInsert;
            }else{
                this.head = toInsert;
            }
        }else{
            throw new IllegalArgumentException();
        }
        return toInsert;
    }

    public Node<T> delete(int location) {
        Node<T> toDelete = null;
        if (this.head != null) {
            if(location > 0) {
                this.tail = toDelete;
            }else{
                this.head = toDelete;
            }

        } else {
            throw new IllegalArgumentException();
        }
        return toDelete;
    }

    public int getIndex(T data) {
        Node<T> object = this.head;
        if (object != null) {
            if (object.data.equals(data)) {
                return 0;
            }
            return 1;
        }
        return  -1;
    }

    public String toString(T data) {
       Node<T> toString = new Node<>(data);
        StringBuilder stringBuilder = new StringBuilder();
        if (toString != null) {
            stringBuilder.append(toString.head.data);
            stringBuilder.append(" -> ");
            stringBuilder.append(toString.tail.data);
        }
        stringBuilder.append("NULL");
        return stringBuilder.toString();
    }

    public String shuffle(T data){
        Node<T> shuff = new Node<>(data);
        if (data != null) {
            return data + " -> " + data + " NULL";
        }
        return null;
    }


}
