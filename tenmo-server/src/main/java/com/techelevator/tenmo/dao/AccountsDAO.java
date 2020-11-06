package com.techelevator.tenmo.dao;

import java.util.List;

import com.techelevator.tenmo.model.AccountTransfer;
import com.techelevator.tenmo.model.Accounts;
import com.techelevator.tenmo.model.TransferDTO;

public interface AccountsDAO {

	void transferMoney(AccountTransfer transfer);
	
	AccountTransfer transferHistory(AccountTransfer transfer);
	
	List<AccountTransfer> getTransferHistory(Long userId);
	
	List<AccountTransfer> getTransferDetails(Long userId, Long transferId);
}
