package promotionData;

import java.rmi.RemoteException;

import promotionDataService.PromotionDataService;
import promotionpo.PromotionPO;


public class PromotionData implements PromotionDataService{
	@Override
	public PromotionPO check(String id)throws RemoteException{
		return null;
	}
	@Override
	public void add(PromotionPO po) throws RemoteException{
		
	}
	@Override
	public void update(PromotionPO po) throws RemoteException{
		
	}
	@Override
	public void del(PromotionPO po) throws RemoteException{
		
	}
	@Override
	public void init()throws RemoteException{
		
	}
	@Override
	public void finish()throws RemoteException{
		
	}
}
