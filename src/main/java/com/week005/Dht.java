package com.week005;
/*Dht*/

import java.util.Map;
import java.util.TreeMap;

public class Dht {

  private int numOfServers;
  private int numOfVirtualNodesPerServer;
  private TreeMap<Integer, Node> nodes;

  public Dht(int numOfServers, int numOfVirtualNodesPerServer) {
    this.numOfServers = numOfServers;
    this.numOfVirtualNodesPerServer = numOfVirtualNodesPerServer;
    nodes = new TreeMap();
    initServer();
  }

  private void initServer() {
    for (int i = 0; i < numOfServers; i++) {
      for (int j = 0; j < numOfVirtualNodesPerServer; j++) {
        Node node = new Node(i, j);
        nodes.put(node.getNodeHashKey(), node);
      }
    }
  }

  public int[] getDistribution() {
    int[] distribution = new int[numOfServers];
    for (Map.Entry<Integer, Node> node : nodes.entrySet()) {
      distribution[node.getValue().getServerNo()] += node.getValue().getCount();
    }
    return distribution;
  }

  public void distribute(int[] data) {
    for (int i = 0; i < data.length; i++) {
      int hashCode = Hash.getHash(data[i] + "");
      Map.Entry<Integer, Node> entry = (entry = nodes.ceilingEntry(hashCode)) != null ? entry : nodes.firstEntry();
      entry.getValue().cache(i, data[i]);
    }
  }
}
