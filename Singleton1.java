MySingleton ms1, ms2, ms3;
ms1 = MySingleton.getInstance();
ms2 = MySingleton.getInstance();
ms3 = MySingleton.getInstance();
System.out.println("inst=" + ms1.instanceCount + ";req=" + ms1.accessRequestCount);
System.out.println("inst=" + ms2.instanceCount + ";req=" + ms2.accessRequestCount);
System.out.println("inst=" + ms3.getInstanceCount() + ";req=" + ms3.getRequestCount());
