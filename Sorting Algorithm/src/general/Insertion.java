package general;

import java.lang.management.MemoryPoolMXBean;
import java.lang.management.MemoryType;
import java.lang.management.MemoryUsage;

import javax.management.ObjectName;

public class Insertion implements MemoryPoolMXBean {

	@Override
	public ObjectName getObjectName() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public MemoryType getType() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public MemoryUsage getUsage() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public MemoryUsage getPeakUsage() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void resetPeakUsage() {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean isValid() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public String[] getMemoryManagerNames() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public long getUsageThreshold() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void setUsageThreshold(long threshold) {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean isUsageThresholdExceeded() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public long getUsageThresholdCount() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean isUsageThresholdSupported() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public long getCollectionUsageThreshold() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void setCollectionUsageThreshold(long threshold) {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean isCollectionUsageThresholdExceeded() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public long getCollectionUsageThresholdCount() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public MemoryUsage getCollectionUsage() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isCollectionUsageThresholdSupported() {
		// TODO Auto-generated method stub
		return false;
	}

}
