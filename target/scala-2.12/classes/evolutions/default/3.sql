# --- !Ups

update project set category_id = 1 where category_id is null; 
# --- !Ups

update employee set category_id = 1 where category_id is null; 