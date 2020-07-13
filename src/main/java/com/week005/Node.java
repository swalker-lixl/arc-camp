package com.week005;

import java.util.HashMap;
import java.util.Map;

public class Node {

  private int nodeNo;

  private int serverNo;

  private int nodeHashKey;

  private Map<Integer, Integer> values = new HashMap<Integer, Integer>(1000);

  public int getServerNo() {
    return serverNo;
  }

  public int getNodeHashKey() {
    return nodeHashKey;
  }

  public Node(int serverNo, int nodeNo) {
    this.serverNo = serverNo;
    this.nodeNo = nodeNo;
    this.nodeHashKey = Hash.getHash("server" + this.serverNo + "#" + String.format("%3d", this.nodeNo));
  }

  public void cache(int key, int value) {
    values.put(key, value);
  }

  public int getCount() {
    return values.size();
  }

}
