package com.bridgeit.ObjectOrientedPrograms;
import com.bridgeit.ObjectOrientedPrograms.SocketAdapter;

/**
*
* @author PUSHPA
*/
//Using inheritance for adapter pattern
public class SocketClassAdapterImpl extends Socket implements SocketAdapter
{

	@Override
	public Volt get120Volt() {
		return getVolt();
	}

	@Override
	public Volt get12Volt() {
		Volt v= getVolt();
		return convertVolt(v,10);
	}

	@Override
	public Volt get3Volt() {
		Volt v= getVolt();
		return convertVolt(v,40);
	}
	
	public Volt convertVolt(Volt v, int i) {
		return new Volt(v.getVolts()/i);
	}

}