package kw.kng.service;

import java.util.List;

import kw.kng.entity.Doctor;

public interface DoctorService
{
	public String registerDoctor(Doctor doctor);
	public long fetchDoctorsCount();
	public boolean checkDoctorAvailability(Integer id);
	public Iterable<Doctor> showAllDoctors();
	public Iterable<Doctor> showAllDoctorsByIds(Iterable<Integer> ids);
	public String registerGroupCustomers(List<Doctor> docList);
	public Doctor showDoctorById(Integer id);
	public String registerOrUpdateDoctor(Doctor doctor);
	public String deleteDocorById(Integer id);
	public String removeAllDoctors();
	public String removeDoctorsByIds(Iterable<Integer> ids);
	
}

/*
 
 long count():
 //-----------
 Returns the number of entities available. It gives the records count in the db table.
 
 
 existsById:
 //-----------
  Returns whether an entity with the given id exits.
 
 
 
 Iterable<T> findAll():
 //----------------------
 Returns all instance of the type. It give all the records of table in
 form of Iterable/List of entity class objcs.
 

Iterable<T> findAllById(Iterable<ID> ids):
//-----------------------------------------

Returns all instance of the type T with the given IDS. If some or all ids are not found,
no entires are returned for these IDS. Note that the order of elements in the result id not
guarenteed.

Parameters: ids - must not be null nor contain any null values;

Returns: guarenteed to be not null. The size can be equal or less than the numbe of given ids/

Throws: Illega;ArgumentException: in case the given ids or one of its items is null.


<S extends T> Iterable <S> saveAll(Iterable <S> entities)
//--------------------------------------------------------
 
 Save all given entities. Entities must not be null nor nust it contain null.
 The save entities will never be null. The returbed Iterable will have the same size as the 
 Iterable passes as an argument.
 
 Throws:
 IllegaArgumentException - in case the entities or one of its entities is null.
 
 OptimistocLockingFailureException=when at least on entity uses optimistic locking and has 
 a version attribute with a different value from the found in the persistence store. Also
 thrown if at least one entity is assumed to be present bit does not exist in the database.
 
 
 
 
 
 
 
 
 
 
 */


